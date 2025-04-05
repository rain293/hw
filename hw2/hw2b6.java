import java.util.Scanner;

public class hw2b6 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a ");
        int a = scanner.nextInt();
        System.out.println("Nhap b ");
        int b = scanner.nextInt();
        System.out.println("Nhap c ");
        int c = scanner.nextInt();

        int p = a + b + c;
        int s = ((p / 2) * (p / 2 - a) * (p / 2 - b) * (p / 2 - c));
        double cosA = (double) (b * b + c * c - a * a) / (2 * b * c);
        double cosB = (double) (a * a + c * c - b * b) / (2 * a * c);
        double cosC = (double) (a * a + b * b - c * c) / (2 * a * b);

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Chu vi = " + p);
            System.out.println("dthich = " + Math.sqrt(s));
            System.out.println("cosA = " + Math.toDegrees(Math.acos(cosA)));
            System.out.println("cosB= " + Math.toDegrees(Math.acos(cosB)));
            System.out.println("cosC = " + Math.toDegrees(Math.acos(cosC)));

        } else {
            System.out.println("Khong la tam giac");
        }
        scanner.close();

    }
}
