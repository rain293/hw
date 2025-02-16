import java.util.Scanner;

public class hw4b5 {
    public static void main(String[] args) {

        // 5. 5. Cho n so va so x.

        // a. Xac dinh xem so x co xuat hien trong day khong?
        // b. Cho biet so x xuat hien trong day bao nhieu lan va tai cac vi tri nao?
        // c. Loai bo khoi day tat ca cac phan tu bang x. In ca 2 day ra man hinh.

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

        System.out.println("Nhap x pls ");
        int x = scanner.nextInt();

        // a. Xac dinh xem so x co xuat hien trong day khong?

        boolean check = false;

        for (int i = 1; i <= n; i++) {
            if (x == array[i]) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("x co xuat hien");
        } else {
            System.out.println("x khong");
        }

        // b. Cho biet so x xuat hien trong day bao nhieu lan va tai cac vi tri nao?

        int cntX = 0;
        for (int i = 1; i <= n; i++) {
            if (x == array[i]) {
                cntX++;
                System.out.println("vi tri x = " + i);
            }
        }
        System.out.println("count x = " + cntX);

        // c. Loai bo khoi day tat ca cac phan tu bang x. In ca 2 day ra man hinh.

        System.out.println("---------------------------");

        int[] brray = new int[200];

        for (int i = 1; i <= n; i++) {

            if (x != array[i]) {
                brray[i] = array[i];
            } else if (x == array[i]) {
                brray[i] = 0;
            }

            if (brray[i] == 0) {
                System.out.println("brray tai vi tri " + i + ": ");
            } else {
                System.out.println("brray tai vi tri " + i + ": " + brray[i]);
            }
        }

        System.out.println("---------------------------");

        for (int i = 1; i <= n; i++) {
            System.out.println("array tai vi tri " + i + ": " + array[i]);
        }

        scanner.close();
    }
}