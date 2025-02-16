import java.util.Scanner;

public class hw1b1 {
    public static void main(String[] args) {

        // Bai tap 1:
        // Tinh chu vi va dien tich hinh chu nhat
        // Viet mot chuong trinh tinh chu vi va dien tich cua mot hinh chu nhat dua tren
        // cac kich thuoc nhap tu ban phim.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu dai = ");
        Integer x = scanner.nextInt();

        System.out.println("Nhap chieu rong = ");
        Integer y = scanner.nextInt();

        int c = (x + y) * 2;
        int s = x * y;

        System.out.println("Chu vi = " + c);
        System.out.println("Dien tich = " + s);

        scanner.close();

    }
}