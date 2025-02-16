import java.util.Scanner;

public class hw4b7 {
    public static void main(String[] args) {

        // 7. Cho mot day gom n so.

        // a. Kiem tra xem day co doi xung hay khong. Vi du day sau la doi xung: 4 2 7 3
        // 7 2 4
        // b. Kiem tra xem day co dan dau hay khong. Vi du day sau la dan dau: 2 -1 7 -3
        // 4 -5 6

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

        // a. Kiem tra xem day co doi xung hay khong. Vi du day sau la doi xung: 4 2 7 3
        // 7 2 4

        boolean isDx = false;

        for (int i = 1; i <= n; i++) {
            if (array[i] == array[n]) {
                n--;
                isDx = true;
            } else {
                isDx = false;
                break;
            }

        }
        if (isDx) {
            System.out.println("day nay co doi xung");
        } else {
            System.out.println("day nay khong doi xung");
        }

        // b. Kiem tra xem day co dan dau hay khong. Vi du day sau la dan dau: 2 -1 7 -3
        // 4 -5 6

        boolean isDd = false;

        for (int i = 1; i < n; i += 2) {
            if (((array[i] > 0) && (array[i + 1] < 0)) || ((array[i] < 0) && (array[i + 1] > 0))) {
                isDd = true;
            } else {
                isDd = false;
                break;
            }

        }
        if (isDd) {
            System.out.println("day nay co dan dau");
        } else {
            System.out.println("day nay khong dan dau");
        }

        scanner.close();
    }
}