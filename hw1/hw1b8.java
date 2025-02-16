import java.util.Scanner;

public class hw1b8 {
    public static void main(String[] args) throws Exception {

        // Bai tap 8:
        // Viet mot chuong trinh nhap vao ba so nguyen tu nguoi dung va kiem tra xem ba
        // so do co the tao thanh tam giac hay khong. Neu co, in ra man hinh loai tam
        // giac (nhon, can, vuong, hoac tam giac thuong), neu khong, in ra "Khong the
        // tao thanh tam giac".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap canh a = ");
        int x = scanner.nextInt();

        System.out.println("Nhap canh b = ");
        int y = scanner.nextInt();

        System.out.println("Nhap canh c = ");
        int z = scanner.nextInt();

        if (x > 0 && y > 0 && z > 0) {
            if (x == y && y == z && z == x) {
                System.out.println("Tam giac deu");
            } else if (x != y && y != z && z != x) {
                System.out.println("Tam giac binh thuong");
            } else if (x == y || y == z || z == x) {
                System.out.println("Tam giac can");
            } else {
                System.out.println("Khong the tao thanh tam giac");
            }
        } else {
            System.out.println("Khong the tao thanh tam giac");
        };

        scanner.close();

    }
}
