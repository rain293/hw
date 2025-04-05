import java.util.Scanner;

public class hw4b3 {
    public static void main(String[] args) {

        // 3. Nhap vao n so nguyen

        // a. Dem so phan am, duong, bang 0 cua day.
        // b. Xac dinh so am lon nhat va so duong nho nhat.
        // c. Cho biet | tong am| co bang tong duong khong.

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

        int cntSoAm = 0;
        int cntSoDuong = 0;
        int cntSoKhong = 0;

        for (int i = 1; i <= n; i++) {
            if (array[i] > 0) {
                cntSoDuong++;
            } else if (array[i] < 0) {
                cntSoAm++;
            } else if (array[i] == 0) {
                cntSoKhong++;
            }
        }
        System.out.println(
                "so so am = " + cntSoAm + " ;" + " so so duong = " + cntSoDuong + " ;" + " so khong = "
                        + cntSoKhong);

        // b. Xac dinh so am lon nhat

        for (int i = 1; i <= n; i++) {
            if (array[i] < 0) {
                int max = array[i];
                for (int j = 1; j <= n; j++) {
                    if ((max < array[j]) && array[j] < 0) {
                        max = array[j];
                    }
                }
                System.out.println("so am lon nhat la " + max);
                break;
            }
        }

        // b. Xac dinh so so duong nho nhat

        for (int i = 1; i <= n; i++) {
            if (array[i] > 0) {
                int min = array[i];
                for (int j = 1; j <= n; j++) {
                    if ((min > array[j]) && array[j] > 0) {
                        min = array[j];
                    }
                }
                System.out.println("so duong nho nhat la " + min);
                break;
            }
        }

        // c. Cho biet | tong am| co bang tong duong khong.

        int sumAm = 0;
        int sumDuong = 0;

        for (int i = 1; i <= n; i++) {
            if (array[i] > 0) {
                sumDuong += array[i];
            } else {
                sumAm += array[i];
            }
        }

        if (Math.abs(sumAm) == sumDuong) {
            System.out.println("|tong am| co bang tong duong");

        } else {
            System.out.println("|tong am| khong bang tong duong");

        }

        scanner.close();
    }
}