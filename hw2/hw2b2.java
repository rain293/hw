import java.util.Scanner;

public class hw2b2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap 1 nam duong lich = ");
        double x = scanner.nextDouble();

        if (x % 4 == 0) {
            System.out.println("x la nam nhuan");
        } else {
            System.out.println("x khong la nam nhuan");
        }

        scanner.close();

    }
}
