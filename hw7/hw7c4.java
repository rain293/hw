import java.util.Scanner;

public class hw7c4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap string : ");
        String str = sc.nextLine();

        String[] a = str.trim().split("\\s+");
        String b = String.join(" ", a);
        System.out.println(b);
    }
}
