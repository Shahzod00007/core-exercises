package begins;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();
        // To'rtburchakning tomonlarini hisoblash
        double a = Math.abs(x2 - x1);
        double b = Math.abs(y2 - y1);
        // Perimetr va yuzani hisoblash
        double perimeter = 2 * (a + b);
        double yuza = a * b;

        // Natijani chiqarish
        System.out.println("Perimetr: " + perimeter);
        System.out.println("Yuza: " + yuza);
    }
}
