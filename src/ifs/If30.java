package ifs;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-999 oraliqdagi sonni kiriting: ");
        int son = scanner.nextInt();

        if (son >= 1 && son <= 999) {
            if (son % 2 == 0) {
                System.out.print("Ikki xonali juft son, ");
            } else {
                System.out.print("Toq son, ");
            }

            if (son < 10) {
                System.out.println("bir xonali.");
            } else if (son < 100) {
                System.out.println("ikki xonali.");
            } else {
                System.out.println("uch xonali.");
            }
        } else {
            System.out.println("Kiritilgan son 1-999 oraliqda emas.");
        }

    }
}
