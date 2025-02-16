import java.util.Scanner;

public class hw3b6 {
    public static void main(String[] args) throws Exception {

        // Bài 6:
        // Nhập vào từ bàn phím 1 số nguyên dương n, tính tổng các số lẻ từ 1 đến n.

        System.out.println("Nhap 1 so nguyen duong = ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
        scanner.close();

    }
}
