package Begin;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A sonini kiriting: ");
        double A = input.nextDouble();
        System.out.print("B sonini kiriting: ");
        double B = input.nextDouble();

        // Nolga teng bo'lmagan sonlar ekanligini tekshirish
        if (A == 0 || B == 0) {
            System.out.println("Iltimos, nolga teng bo'lmagan sonlar kiriting.");
            return;
        }

        // Yig'indi va ko'paytmani hisoblash
        double sum = A + B;
        double product = A * B;

        // Har bir sonning modulini (absolyut qiymatini) aniqlash
        double modA = Math.abs(A);
        double modB = Math.abs(B);


        System.out.println("Yig'indisi: " + sum);
        System.out.println("Ko'paytmasi: " + product);
        System.out.println("A ning moduli: " + modA);
        System.out.println("B ning moduli: " + modB);
    }
}
