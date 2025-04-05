import java.util.Scanner;

public class hw4b1 {
    public static void main(String[] args) {

        // 1. Cho n so nguyen
        // a. Tim vi tri va gia tri phan tu lon nhat cua day.
        // b. Tim vi tri va gia tri phan tu nho nhat cua day.
        // c. Tinh tong cac phan tu cua day.

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

        // xuat array

        // for (int i = 1; i <= n; i++) {
        // System.out.println("array tai vi tri i : " + array[i]);
        // }

        // khai bao

        int max = array[1];
        int min = array[1];

        // a. Tim vi tri va gia tri phan tu lon nhat cua day.
        // b. Tim vi tri va gia tri phan tu nho nhat cua day.

        for (int i = 1; i + 1 <= n; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
            if (min > array[i + 1]) {
                min = array[i + 1];
            }
        }

        // tim vi tri

        for (int i = 1; i <= n; i++) {
            if (max == array[i]) {
                System.out.println("max = " + max + ";" + " vi tri max = " + i);
            }
            if (min == array[i]) {
                System.out.println("min = " + min + ";" + " vi tri min = " + i);
            }
        }

        // c. Tinh tong cac phan tu cua day.

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);

        scanner.close();
    }
}