import java.util.Scanner;

public class hw1b11 {
    public static void main(String[] args) throws Exception {

        // Bai tap nang cao:
        // Tinh tong day so
        // Viet mot chuong trinh de tinh tong cua day so tu nhien tu 1 den n, trong do n
        // la so nguyen nhap tu ban phim.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap 1 so nguyen = ");
        int x = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }

        System.out.println("Tong day so = " + sum);
        scanner.close();

    }
}
