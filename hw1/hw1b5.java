import java.util.Scanner;

public class hw1b5 {
    public static void main(String[] args) throws Exception {

        // Bai tap 5:
        // Tinh dien tich hinh thang:
        // Viet mot chuong trinh tinh dien tich cua mot hinh thang dua tren do dai hai
        // canh day va do dai chieu cao duoc nhap tu ban phim. Hinh thang co dien tich
        // duoc tinh bang cong thuc: dien tich = (day1 + day2) * chieu cao / 2.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap day 1 = ");
        int x = scanner.nextInt();

        System.out.println("Nhap day 2 = ");
        int y = scanner.nextInt();

        System.out.println("Nhap chieu cao = ");
        int z = scanner.nextInt();

        double s = (x + y) * z / 2;
        System.out.println("s = " + s);

        scanner.close();

    }
}