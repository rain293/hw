import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) throws Exception {

        // Bai tap 2: 
        // Tinh chu vi va dien tich hinh tron
        // Viet mot chuong trinh tinh chu vi va dien tich cua mot hinh tron dua tren ban kinh nhap tu ban phim. Su dung gia tri pi la 3.14159.

        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap r = ");
        int r = scanner.nextInt();

        double c = 2 * pi * r;
        System.out.println("Chu vi = " + c);

        double a = r * r;
        double s = pi * a;
        System.out.println("Dien tich = " + s);

        scanner.close();
        
    }
}