
public class hw3b7 {
    public static void main(String[] args) throws Exception {

        // Bai 7:
        // Su dung vong lap in ra bang cuu chuong (8 bang tu 2 den 9)

        for (int i = 2; i <= 9; i++) {

            for (int j = 1; j <= 10; j++) {
                int sum = i * j;
                System.out.println(j + "x" + i + "=" + sum);
            }
            System.out.println("");
        }
    }
}
