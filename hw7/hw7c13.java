import java.util.Scanner;

public class hw7c13 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap chuoi : ");
        // String str = sc.nextLine();

        String str = "Racecar";
        String str2 = str.toLowerCase();

        String[] a = str2.split("");
        String b = "";

        for (int i = str2.length() - 1; i >= 0; i--) {
            b = b.concat(a[i]);
        }

        boolean tf = b.equals(str2);
        System.out.println(tf);
    }
}