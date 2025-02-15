package integers;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("999 dan katta sonni kiriting: ");
        int son = scanner.nextInt();

        if (son > 999) {
            int yuzlikRaqam = (son / 100) % 10;

            System.out.println("Yuzliklar xonasidagi raqam: " + yuzlikRaqam);
        } else {
            System.out.println("Kiritilgan son 999 dan katta bo'lishi kerak!");
        }
    }
}
