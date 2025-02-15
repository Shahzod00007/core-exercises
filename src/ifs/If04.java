package ifs;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Foydalanuvchidan uchta butun son kiritish
        System.out.print("1-sonni kiriting: ");
        int son1 = scanner.nextInt();

        System.out.print("2-sonni kiriting: ");
        int son2 = scanner.nextInt();

        System.out.print("3-sonni kiriting: ");
        int son3 = scanner.nextInt();

        int musbatSana = 0;
        int manfiySana = 0;

        // Musbat va manfiy sonlarni aniqlash
        if (son1 > 0) musbatSana++;
        else if (son1 < 0) manfiySana++;

        if (son2 > 0) musbatSana++;
        else if (son2 < 0) manfiySana++;

        if (son3 > 0) musbatSana++;
        else if (son3 < 0) manfiySana++;
        System.out.println("Musbat sonlar soni: " + musbatSana);

    }
}
