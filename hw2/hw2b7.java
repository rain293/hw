import java.util.Scanner;

public class hw2b7 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a ");
        int a = scanner.nextInt();
        System.out.println("Nhap b ");
        int b = scanner.nextInt();
        System.out.println("Nhap c ");
        int c = scanner.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            if ((a == b) && (b == c)) {
                System.out.println("tam giac deu");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("tam giac can");
            } else if (a * a + b * b == c * c) {
                System.out.println("tam giac vuong");
            } else if ((a == b) && (a * a + b * b == c * c)) {
                System.out.println("tam giac vuong can");
            } else {
                System.out.println("tam giac normal");
            }

        } else {
            System.out.println("Khong la tam giac");
        }
        scanner.close();

    }
}
