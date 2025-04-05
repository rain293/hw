import java.util.Scanner;

public class hw7c10 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap string : ");
        // String str = sc.nextLine();

        String str = "programming";
        char[] a = str.toCharArray();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        String str2 = new String(a);
        System.out.println(str2);
    }
}
