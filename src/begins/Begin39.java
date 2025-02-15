package begins;
import java.util.Scanner;
public class Begin39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        double A = scanner.nextDouble();
        System.out.print("B = ");
        double B = scanner.nextDouble();
        System.out.print("C = ");
        double C = scanner.nextDouble();
        // Kvadrat tenglamaning diskriminantini hisoblash
        double D = B * B - 4 * A * C;

        if (A == 0) {
            System.out.println("Xatolik: A nolga teng bo‘lishi mumkin emas!");
        } else if (D > 0) {
            // Ikkita haqiqiy ildiz mavjud
            double x1 = (-B + Math.sqrt(D)) / (2 * A);
            double x2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("Tenglamaning yechimlari:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Tenglama ikkita haqiqiy yechimga ega emas.");
        }
    }
}
