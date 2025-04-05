import java.util.Scanner;

public class hw7c16 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap chuoi : ");
        // String str = sc.nextLine();

        String str = "abcaabbccd";
        String b = "";

        for (int i = 0; i < str.length(); i++) {
            String c = str.charAt(i) + "";
            if (b.contains(c) == false) {
                b += c;
            }
        }
        System.out.println(b);
    }
}