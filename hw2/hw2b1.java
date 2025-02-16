import java.util.Scanner;

public class hw2b1 {
    public static void main(String[] args) throws Exception {

        // 1.1 Cho 2 so thuc a va b. Tim so lon nhat giua 2 so do.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thuc 1 = ");
        double x = scanner.nextDouble();

        System.out.println("Nhap so thuc 2 = ");
        double y = scanner.nextDouble();

        System.out.println("So thuc lon nhat la = " + Math.max(x, y));

        scanner.close();

    }
}
