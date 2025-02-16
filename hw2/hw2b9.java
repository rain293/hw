import java.util.Scanner;

public class hw2b9 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhap n ");
            n = scanner.nextInt();
            if (n >= 1000) {
                System.out.println("nhap so <1000 pls");
            }
        } while (n >= 1000);

        String[] so = { "khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin", "muoi`", "tu", "lam",
                "le", " tram ", " ", " muoi ", "mot' " };

        if (n < 10) {

            System.out.println(so[n] + " ");

        } else if ((n >= 10) && (n < 100)) {

            String a, b, t;
            int x = (int) (n / 10);
            int y = n - (10 * x);

            a = so[x];
            b = so[y];

            if (x == 1 && y == 0) {
                a = so[10];
                b = so[15];
            } else if (x == 1 && y != 0) {
                a = so[10];
            }

            if (y == 0) {
                b = so[15];
            } else if (y == 4) {
                if (x == 1 || x == 4) {
                    b = so[y];
                } else {
                    b = so[11];
                }
            } else if (y == 5) {
                b = so[12];
            }

            if (n < 20) {
                t = so[15];
            } else {
                t = so[16];
                b = so[17];
            }

            System.out.println(a + t + b);

        } else if (n >= 100) {

            String a, b, c, d, e;
            int x = (int) (n / 100);
            int m = n - (100 * x);
            int y = (int) (m / 10);
            int z = m - (y * 10);

            a = so[x];
            b = so[y];
            c = so[z];
            d = so[14];
            e = so[16];

            if (y == 0) {
                if (z == 0) {
                    b = so[15];
                    e = so[15];
                    c = so[15];
                } else {
                    b = so[13];
                    e = so[15];
                }
            } else if (y == 1) {
                if (z == 0) {
                    b = so[10];
                    e = so[15];
                    c = so[15];
                } else {
                    b = so[10];
                    e = so[15];
                }
            }

            if (z == 0) {
                c = so[15];
            } else if (z == 4) {
                if (y == 1 || y == 4) {
                    c = so[z];
                } else {
                    c = so[11];
                }
            } else if (z == 5) {
                c = so[12];
            } else if (z == 1 && y > 1) {
                c = so[17];
            }

            System.out.println(a + d + b + e + c);
        } else {
            System.out.println("unsupport format");
        }

        scanner.close();

    }
}
