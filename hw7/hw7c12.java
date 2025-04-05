import java.util.Scanner;

public class hw7c12.s
{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap string : ");
        // String str = sc.nextLine();

        String str = "abc";
        char[] a = str.toCharArray();

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
            String str2 = new String(a);
            System.out.println(str2);
        }

    }
}
