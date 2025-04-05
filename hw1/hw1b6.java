import java.util.Scanner;

public class hw1b6 {
    public static void main(String[] args) throws Exception {

        // Bai tap 6:
        // Viet mot chuong trinh nhap vao mot so nguyen tu nguoi dung va kiem tra xem so
        // do la so chan hay so le. In ra man hinh thong bao tuong ung.

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap 1 so nguyen = ");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Do la so chan");
        } else {
            System.out.println("Do la so le");
        }

        scanner.close();

    }
}
