import java.util.Scanner;

public class hw1b7 {
    public static void main(String[] args) throws Exception {

        // Bai tap 7:s
        // Viet mot chuong trinh nhap vao ba so nguyen tu nguoi dung va tim so lon nhat
        // trong ba so do. In ra man hinh so lon nhat.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thu 1 = ");
        int x = scanner.nextInt();

        System.out.println("Nhap so thu 2 = ");
        int y = scanner.nextInt();

        System.out.println("Nhap so thu 3 = ");
        int z = scanner.nextInt();

        int max1 = Math.max(x, y);
        int max2 = Math.max(y, z);
        int max3 = Math.max(max1, max2);

        System.out.println("Max = " + max3);

        scanner.close();

    }
}
