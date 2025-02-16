import java.util.Scanner;

public class hw3b5 {
    public static void main(String[] args) throws Exception {

        // Bai 5:
        // Nhap vao tu ban phim 1 so nguyen duong n, tinh tong cac so tu 1 den n.

        System.out.println("Nhap 1 so nguyen duong = ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        scanner.close();

    }
}
