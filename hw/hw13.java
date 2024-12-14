import java.util.Scanner;

public class hw13 {
    public static void main(String[] args) throws Exception {

        // 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thuc 1 = ");
        double x = scanner.nextDouble();

        System.out.println("Nhap so thuc 2 = ");
        double y = scanner.nextDouble();

        System.out.println("So thuc lon nhat la = " + Math.max(x, y));

        scanner.close();

    }
}
