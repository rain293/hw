import java.util.Scanner;
import static java.lang.Math.*;

public class hw2b5 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a1 ");
        int a1 = scanner.nextInt();
        System.out.println("Nhap b1 ");
        int b1 = scanner.nextInt();
        System.out.println("Nhap a2 ");
        int a2 = scanner.nextInt();
        System.out.println("Nhap b2 ");
        int b2 = scanner.nextInt();

        int lgiao = min(b1, b2) - max(a1, a2);
        int lhop = max(b1, b2) - min(a1, a2);

        System.out.println("Do dai phan giao = " + lgiao);
        System.out.println("Do dai phan hop = " + lhop);
        scanner.close();

    }
}
