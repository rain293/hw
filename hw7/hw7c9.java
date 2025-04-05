import java.util.Scanner;

public class hw7c9 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap string : ");
        // String str = sc.nextLine();

        String str = "Nguyen Van A";
        String[] a = str.trim().split(" ");

        System.out.println("firstName: " + a[0]);
        System.out.println("middleName: " + a[1]);
        System.out.println("lastName: " + a[2]);

    }
}
