import java.util.Scanner;

public class hw1b4 {
    public static void main(String[] args) throws Exception {

        // Bai tap 4:
        // Tinh chi so BMI
        // Viet mot chuong trinh de tinh chi so BMI (Body Mass Index) dua tren can nang
        // va chieu cao nhap tu ban phim. Cong thuc tinh BMI la: BMI = can nang (kg) /
        // (chieu cao * chieu cao) (don vi m^2).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap can nang = ");
        int x = scanner.nextInt();

        System.out.println("Nhap chieu cao = ");
        double y = scanner.nextDouble();

        double bmi = x / (y * y);
        System.out.println("BMI = " + bmi);

        scanner.close();

    }
}
