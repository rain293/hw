import java.util.Scanner;

public class hw7c1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap chuoi : ");
        String str = sc.nextLine();
        String rvStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rvStr += str.charAt(i);
        }
        System.out.println(rvStr);
    }
}