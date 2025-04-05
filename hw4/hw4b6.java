import java.util.Scanner;

public class hw4b6 {
    public static void main(String[] args) {

        // 6. Cho mot day gom n so.

        // a. Kiem tra xem day co tang dan hay khong.
        // b. Sap xep day theo thu tu tang dan. In day ket qua ra man hinh.

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

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu so " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println("---------------------------");

        // a. Kiem tra xem day co tang dan hay khong.

        boolean checkTang = false;

        for (int i = 0; i < n; i++) {
            if (array[i] <= array[i + 1]) {
                checkTang = true;
            } else {
                checkTang = false;
                break;
            }
        }
        if (checkTang) {
            System.out.println("Day nay tang dan");
        } else {
            System.out.println("Day nay khong tang dan");
        }

        // b. Sap xep day theo thu tu tang dan. In day ket qua ra man hinh.

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                } else {
                }
            }
        }

        // in tung phan tu array
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        scanner.close();
    }
}