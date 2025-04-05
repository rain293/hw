import java.util.Scanner;

public class hw7c2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap chuoi : ");
        String str = sc.nextLine();

        System.out.println("Nhap ki tu : ");
        String kt = sc.nextLine();

        int cnt = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == kt.charAt(0)) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}