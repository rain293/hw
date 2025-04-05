import java.util.Scanner;

public class hw2b4 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a ");
        int a = scanner.nextInt();
        System.out.println("Nhap b ");
        int b = scanner.nextInt();
        System.out.println("Nhap c ");
        int c = scanner.nextInt();

        int y = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(y)) / (2 * a);
        double x2 = (-b - Math.sqrt(y)) / (2 * a);
        double x = -b / (2 * a);

        if (y > 0) {
            System.out.println("2 nghiem la x1 =" + x1 + "va x2 = " + x2);
        } else if (y == 0) {
            System.out.println("1 nghiem la x =" + x);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }

        scanner.close();

    }
}
