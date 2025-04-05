import java.util.Scanner;

public class hw7c11 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap string : ");
        // String str = sc.nextLine();

        String str = "hello world of programming";
        String[] a = str.trim().split(" ");
        String b = "";

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i].substring(0, 1).toUpperCase() + a[i].substring(1);
            b += a[i];
        }
        System.out.println(b);

    }
}
