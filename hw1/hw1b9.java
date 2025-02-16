import java.util.Scanner;

public class hw1b9 {
    public static void main(String[] args) throws Exception {

        // Bai tap 9:
        // Viet mot chuong trinh nhap vao mot ky tu tu nguoi dung va kiem tra xem ky tu
        // do la chu cai in hoa, chu cai in thuong, hoac khong phai la chu cai. In ra
        // man hinh thong bao tuong ung.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap 1 ki tu = ");
        char x = scanner.nextLine().charAt(0);

        if (Character.isDigit(x)) {
            System.out.println("Day la so");

        } else if (Character.isUpperCase(x)) {
            System.out.println("Day la chu hoa");

        } else if (Character.isLowerCase(x)) {
            System.out.println("Day la chu thuong");

        } else {
            System.out.println("ki tu khac");
        }

        scanner.close();

    }
}
