package booleans;

import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nuqta koordinatalarini kiriting (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.print("To‘rtburchakning chap yuqori burchagi (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("To‘rtburchakning o‘ng pastki burchagi (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean ichidaYotadi = (x >= x1 && x <= x2 && y <= y1 && y >= y2);

        if (ichidaYotadi) {
            System.out.println("Nuqta to‘rtburchak ichida yotadi.");
        } else {
            System.out.println("Nuqta to‘rtburchak tashqarisida yotadi.");
        }
    }
}

