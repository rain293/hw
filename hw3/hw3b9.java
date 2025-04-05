import java.util.Scanner;

public class hw3b9 {
    public static void main(String[] args) throws Exception {

        // Bai 9:
        // Nhap vao mot so nguyen duong n tu ban phim
        // Dem so luong chu so cua so nguyen duong n.
        // Vi du:
        // voi n = 89245
        // ket qua: 5

        // voi n = 251
        // ket qua: 3

        // Goi y:
        // dung phep chia lay du cho 10 ( %10 ) de lay duoc cac so cuoi.

        System.out.println("Nhap 1 so nguyen duong = ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = 0;

        for (x = 0; x >= 0; x++) {

            int a = n / 10;
            int r = n - (a * 10);

            if (0 <= r && r <= 9) {
                if (a == 0) {
                    x += 1;
                    break;
                } else {
                    n = a;
                }
            } else {
                break;
            }
            scanner.close();
        }

        System.out.println(x);
    }
}
