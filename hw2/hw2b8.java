import java.util.Scanner;

public class hw2b8 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n ");
        int n = scanner.nextInt();
        String[] tCan = { "Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Dinh", "Mau", "Ky" };
        String[] dChi = { "Than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Dan", "Mao", "Thin", "Ty", "Ngo", "Mui" };

        String a = "", b = "";

        for (int i = 0; i <= 12; i++) {
            if (n % 10 == i) {
                a = tCan[i];
                break;
            }
        }
        for (int i = 0; i <= 11; i++) {
            if (n % 12 == i) {
                b = dChi[i];
                break;
            }
        }
        System.out.println(a + " " + b);
        scanner.close();

    }
}
