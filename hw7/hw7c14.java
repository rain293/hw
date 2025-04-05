import java.util.Scanner;

public class hw7c14 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap chuoi : ");
        // String str = sc.nextLine();

        String str = "1234567890";
        System.out.println(str.substring(0, 3) + "-" + str.substring(3, 6) + "-" + str.substring(6, 10));
    }
}