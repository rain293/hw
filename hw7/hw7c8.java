import java.util.Scanner;

public class hw7c8 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap chuoi : ");
        // String str = sc.nextLine();

        String a = "Hello, world!";
        String b = "world";
        String c = "universe";

        a = a.replace(b, c);
        System.out.println(a);
    }
}