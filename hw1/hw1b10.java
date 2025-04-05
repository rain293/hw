import java.util.Scanner;

public class hw1b10 {
    public static void main(String[] args) throws Exception {

        // Bai tap 10:
        // Viet mot chuong trinh nhap vao mot nam tu nguoi dung va kiem tra xem nam do
        // co phai la nam nhuan hay khong. In ra man hinh thong bao tuong ung.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap 1 nam = ");
        int x = scanner.nextInt();

        if (x % 4 == 0) {
            System.out.println("Day la nam nhuan");
        } else {
            System.out.println("Day khong la nam nhuan");
        }

        scanner.close();

    }
}
