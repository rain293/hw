import java.util.Scanner;

public class hw7c3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap ho va ten : ");
        String str = sc.nextLine();

        str = str.trim().toLowerCase();
        String result = str.substring(0, 1).toUpperCase();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                result += Character.toUpperCase(str.charAt(i));
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}