import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    public float averageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void display() {
        System.out.println("title: " + getTitle());
        System.out.println("publishDate: " + getPublishDate());
        System.out.println("author: " + getAuthor());
        System.out.println("content: " + getContent());
        System.out.println("averageRate: " + getAverageRate());
    }
    int[] rateList = new int[3];
    public void caculate(){
        float s = 0;
        for(int i = 0; i < rateList.length; i++){
            s += rateList[i];
        }
        averageRate = s/3;
        System.out.println("average: " + averageRate);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Insert news");
        System.out.println("2 - View list news");
        System.out.println("3 - Averaga rate");
        System.out.println("4 - Exit");

        ArrayList<News> arrayList = new ArrayList<News>();


        while(true) {
            System.out.print("Nhap lua chon: ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    News a = new News();

                    System.out.print("Nhap title: ");
                    a.setTitle(scanner.nextLine());
                    scanner.hasNextLine();
                    System.out.print("Nhap publishDate: ");
                    a.setPublishDate(scanner.nextLine());
                    scanner.hasNextLine();
                    System.out.print("Nhap author: ");
                    a.setAuthor(scanner.nextLine());
                    scanner.hasNextLine();
                    System.out.print("Nhap content: ");
                    a.setContent(scanner.nextLine());
                    scanner.hasNextLine();
                    scanner.next();

                    System.out.println("Moi nhap danh gia: ");

                    for(int i = 0; i < 3; i++){
                        a.rateList[i] = scanner.nextInt();
                    }

                    arrayList.add(a);
                    break;

                case 2:
                    for( News i : arrayList) {
                        i.display();
                    }
                    break;

                case 3:
                    for( News i : arrayList) {
                        i.caculate();
                        i.display();
                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
