import java.util.Scanner;

public class hw1b3 {
    public static void main(String[] args) throws Exception {

        // Bai tap 3:
        // Tinh tien dien
        // Viet mot chuong trinh de tinh tien dien dua tren so dien tieu thu. Yeu cau
        // nguoi dung nhap so dien tieu thu, sau do tinh va in ra so tien can tra. Gia
        // su rang gia dien la 1500 dong/so.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so dien = " );
        int a = scanner.nextInt();
        
        int s = a * 1500;
        System.out.println("So tien can tra = " + s + " VND");

        scanner.close();
    }
}
