import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Square square = new Square();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai canh: ");
        square.canh = scanner.nextFloat();
        square.showCanh();
        square.dientich();
        square.chuvi();
        square.show();
    }
}
