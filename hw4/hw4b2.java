import java.util.Scanner;

public class hw4b2 {
    public static void main(String[] args) {

        // 2. Cho n so nguyen. Tim xem phan tu lon nhat xuat hien trong day may lan.

        // khai bao array

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

        // khai bao

        int max = array[1];

        // a. Tim vi tri va gia tri phan tu lon nhat cua day.

        for (int i = 1; i + 1 <= n; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }

        // tim vi tri max

        int count = 0;
        System.out.println("max = " + max);

        for (int i = 1; i <= n; i++) {
            if (max == array[i]) {
                count++;
                System.out.println("vi tri max la vi tri thu " + i);
            }
        }
        System.out.println("so lan max xuat hien = " + count);

        scanner.close();
    }
}