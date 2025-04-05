import java.util.Scanner;

public class hw4b4 {
    public static void main(String[] args) {

        // 4. Cho n so. Dao thu tu cua day theo nguyen tac sau: A[1] doi cho voi A[n],
        // A[2] doi cho voi A[n-1], ...
        // In ket qua ra man hinh.

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[200];
        int n;

        // nhap so luong phan tu array

        do {
            System.out.println("Nhap so luong phan tu array");
            n = scanner.nextInt();

            if (n <= 0 || n > 200) {
                System.out.println("n phai nam trong khoang 0-200");
            }
        } while (n <= 0 || n > 200);

        // nhap tung phan tu array 1

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap phan tu so " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println("---------------------------");

        for (int i = 1; i <= n; i++) {
            int x = array[i];
            array[i] = array[n];
            array[n] = x;
            n--;
        }

        // xuat array

        for (int i = 1; i <= 2 * n + 1; i++) {
            System.out.println("array sau khi dao tai vi tri thu " + i + ": " + array[i]);
        }

        scanner.close();
    }
}