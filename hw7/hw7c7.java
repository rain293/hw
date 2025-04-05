import java.util.Scanner;

public class hw7c7 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap chuoi : ");
        // String str = sc.nextLine();

        String str = "madam";
        String[] a = str.split("");
        String b = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            b = b.concat(a[i]);
        }

        boolean tf = b.equals(str);
        System.out.println(tf);
    }
}