import java.util.Scanner;

public class hw7c6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Nhap chuoi : ");
        // String str = sc.nextLine();

        String str = "This is a sentence.";
        String[] a = str.trim().split("\\s+");
        System.out.println(a.length);
    }
}