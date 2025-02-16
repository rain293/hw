import java.util.Scanner;

public class hw2b10 {
    public static void main(String[] args) throws Exception {

        int d, m, y, dCnt;
        try (Scanner scanner = new Scanner(System.in)) {

            do {
                System.out.println("Nhap d ");
                d = scanner.nextInt();
                System.out.println("Nhap m ");
                m = scanner.nextInt();
                System.out.println("Nhap y ");
                y = scanner.nextInt();
                if ((d <= 0) || (d > 31) || (m > 12)) {
                    System.out.println("pls nhap gia tri hop le");
                }
            } while ((d <= 0) || (d > 31) || (m > 12));

            if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 12)) {
                dCnt = 31;
            } else if ((m == 4) || (m == 6) || (m == 9) || (m == 11)) {
                dCnt = 30;
            } else {
                if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
                    dCnt = 29;
                } else {
                    dCnt = 28;
                }
            }

            if (d < dCnt) {
                d++;
            } else if (d == dCnt) {
                d = 1;
                if (m == 12) {
                    m = 1;
                    y++;
                } else {
                    m++;
                }
            } else {
                System.out.println("ngay k hop le");
                return;
            }
            System.out.println(d + " " + m + " " + y);

        }
    }
}
