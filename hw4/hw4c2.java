import java.util.Scanner;

public class hw4c2 {
    public static void main(String[] args) throws Exception {
        // khai bao array
        int[] array = new int[200];
        int n;
        Scanner scanner = new Scanner(System.in);

        // Nhap so luong phan tu cua aaray
        do {
            System.out.println("Nhap n");
            n = scanner.nextInt();

            if (n <= 0 || n > 200) {
                System.out.println("n phai tu 0 - 200");
            }
        } while (n <= 0 || n > 200);

        // Nhap array
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap array thu " + i);
            array[i] = scanner.nextInt();
        }

        // Xuat Array
        System.out.println("Cac so hoan hao la");
        for (int i = 0; i < n; i++) {
            int a = 0;
            for (int j = 1; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    a += j;
                    if (a == array[i]) {
                        System.out.println(array[i]);
                    }
                }
            }
        }

        scanner.close();
    }
}
