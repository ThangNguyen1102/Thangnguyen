import java.util.Scanner;

public class bai2 {
    public static void main(String[] args)
    {
        float sodien, total;
        Scanner scanner = new Scanner(System.in);

        int x1 = 1000, x2 = 1250, x3 = 1800, x4 = 2500;
        do {
            System.out.print("Nhap so dien trong 1 thang: ");
            sodien = scanner.nextFloat();
            if(sodien < 0)
            {
                System.out.println("So dien khong hop le, vui long nhap lai!");
            }
        }while(sodien < 0);
        if(sodien <= 25)
        {
            total = sodien * x1;
            System.out.println("Tien dien phai tra la: " + total);
        }
        else if (sodien <= 75) {
            total = 25 * x1 + (sodien - 25) * x2;
            System.out.println("Tien dien phai tra la: " + total);
        }
        else if (sodien <= 150){
            total = 25 * x1 + 50 * x2 + (sodien - 75) * x3;
            System.out.println("Tien dien phai tra la: " + total);
        }
        else if (sodien > 150){
            total = 25 * x1 + 50 * x2 + 75 * x3 + (sodien - 150) * x4;
            System.out.println("Tien dien phai tra la: " + total);
        }
    }
}
