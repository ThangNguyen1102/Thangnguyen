import java.util.Scanner;

public class bai1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = bai1.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = bai1.scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();

        //tinh delta
        float delta = b*b - 4*a*c;
        System.out.println("Can delta bang: " + Math.sqrt(delta));
    }

}
