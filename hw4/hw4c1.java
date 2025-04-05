import java.util.Scanner;

public class hw4c1 {
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
        System.out.println("Array vua nhap la");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "");
        }

        // Chewck so nto

        // In ra cac so nmguyen to trong mang
        System.out.println("Cac so nto trong mang la ");
        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            if (array[i] < 2) {
                isPrime = false;
            }
            // Khiem tra array[i] co phai so nto hay k
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(array[i] + "");
            }
        }

        scanner.close();
    }
}
