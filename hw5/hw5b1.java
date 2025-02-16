import java.util.Arrays;
import java.util.Scanner;

public class hw5b1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int a = 0;
        int k = 0;

        int[] array = new int[200];
        n = input(scanner, array);
        a = inputA(scanner);
        k = inputK(scanner, n);

        // sum(n, array);
        // avr(n, array);
        // revArr(n, array);
        // min(n, array);
        // max(n, array);
        // isSnt(n, array);
        // max2(n, array);
        // cnt(a, n, array);
        // ssm(n, array);
        chen(a, k, n, array);
        // tim(n, array);
        // cnt2(n, array);
        // xoa(n, array);
        // print(n, array);

    }

    public static int input(Scanner scanner, int[] array) {
        int n;
        do {
            System.out.println("Nhap day n ptu");
            n = scanner.nextInt();
            if (n < 0 || n > 200) {
                System.out.println("Pls reipnut dung format");
            }
        } while ((n < 0 || n > 200));

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tung ptu so " + (i + 1));
            array[i] = scanner.nextInt();
        }
        return n;
    }

    public static int inputA(Scanner scanner) {
        int a;
        do {
            System.out.println("Nhap so a can cnt");
            a = scanner.nextInt();
            if (a < 0 || a > 200) {
                System.out.println("Pls reipnut dung format");
            }
        } while ((a < 0 || a > 200));
        return a;
    }

    public static int inputK(Scanner scanner, int n) {
        int k;
        do {
            System.out.println("Nhap vi tri k can chen");
            k = scanner.nextInt();
            if (k < 0 || k > 200) {
                System.out.println("Pls reipnut dung format");
            }
        } while ((k < 0 || k > 200));
        return k;
    }

    public static void print(int n, int[] array) {
        for (int i = 0; i < n; i++) {
            System.out.println("ptu so " + (i + 1) + " la " + array[i]);
        }
    }

    public static void sum(int n, int[] array) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void avr(int n, int[] array) {
        double tb = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            tb = (double) sum / n;
        }
        System.out.println("Avr: " + tb);
    }

    public static void revArr(int n, int[] array) {
        int i = n;
        for (; i > 0; i--) {
            int f = array[i - 1];
            System.out.println("ptu so " + (n - i + 1) + " la " + f);
        }
    }

    public static void min(int n, int[] array) {
        int min = array[0];
        for (int i = 0; i + 1 < n; i++) {
            if (min > array[i + 1]) {
                min = array[i + 1];
            }
        }
        System.out.println("min = " + min);
    }

    public static void max(int n, int[] array) {
        int max = array[0];
        for (int i = 0; i + 1 < n; i++) {
            max = array[i];
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        System.out.println("max = " + max);
    }

    public static void isSnt(int n, int[] array) {
        for (int i = 0; i < n; i++) {
            boolean snt = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (array[i] == 2 || array[i] == 3 || array[i] > 1 && array[i] % j != 0) {
                    snt = true;
                } else {
                    snt = false;
                    break;
                }
            }
            if (snt) {
                System.out.println("so la so nto : " + array[i]);
            } else {
                System.out.println("ko la so nto : " + array[i]);
            }
        }
    }

    public static void max2(int n, int[] array) {
        int max = array[0];
        int i = 0;
        for (i = 0; i < n; i++) {
            max = array[i];
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        array[i] = 0;
        int max2 = array[0];
        for (i = 0; i + 1 < n; i++) {
            max2 = array[i];
            if (max2 < array[i + 1]) {
                max2 = array[i + 1];
            }
        }
        System.out.println("max2 = " + max2);
    }

    public static void cnt(int a, int n, int[] array) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == a) {
                cnt++;
            }
        }
        System.out.println("a xuat hien so lan la " + cnt);
    }

    public static void ssm(int n, int[] array) {
        for (int i = 0; i < n; i++) {
            int t = 0;
            for (int j = 0; j + 1 < n - i; j++) {
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        print(n, array);
    }

    public static void chen(int a, int k, int n, int[] array) {
        n = n + 1;
        for (int i = n - 1; i > k; i--) {
            array[i] = array[i - 1];
        }
        array[k] = a;
        print(n, array);
    }

    public static void tim(int n, int[] array) {
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (array[i] == array[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println("so xhien 1 lan la " + array[i]);
            }
        }
    }

    public static void cnt2(int n, int[] array) {
        int[] brray = Arrays.copyOf(array, n);

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (array[i] == brray[j]) {
                    cnt++;
                    brray[j] = 0;
                }
            }
            if (cnt > 0) {
                System.out.println(array[i] + " xuat hien " + cnt + " lan");
            }
        }
    }

    public static void xoa(int n, int[] array) {
        int[] brray = Arrays.copyOf(array, n);
        int a = 0;
        int n2 = n;
        for (int i = 0; i < n; i++) {
            boolean dup = false;
            for (int j = 0; j < a; j++) {
                if (array[i] == brray[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                brray[a++] = array[i];
                n2--;
            }
        }
        print(n - n2, brray);
    }

}