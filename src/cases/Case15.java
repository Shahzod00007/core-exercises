package cases;

import java.util.Scanner;

public class Case15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N=");
        int N=scanner.nextInt();

        if (N < 1 || N > 999) {
            System.out.println("Noto‘g‘ri son! Faqat 1 dan 999 gacha bo‘lgan sonlarni kiriting.");
            return;
        }

        int yuz = N / 100;
        int on = (N % 100) / 10;
        int bir = N % 10;

        // Yuzliklar
        switch (yuz) {
            case 1: System.out.print("bir yuz "); break;
            case 2: System.out.print("ikki yuz "); break;
            case 3: System.out.print("uch yuz "); break;
            case 4: System.out.print("to‘rt yuz "); break;
            case 5: System.out.print("besh yuz "); break;
            case 6: System.out.print("olti yuz "); break;
            case 7: System.out.print("yetti yuz "); break;
            case 8: System.out.print("sakkiz yuz "); break;
            case 9: System.out.print("to‘qqiz yuz "); break;
        }

        // O'nliklar
        switch (on) {
            case 1: System.out.print("o‘n "); break;
            case 2: System.out.print("yigirma "); break;
            case 3: System.out.print("o‘ttiz "); break;
            case 4: System.out.print("qirq "); break;
            case 5: System.out.print("ellik "); break;
            case 6: System.out.print("oltmish "); break;
            case 7: System.out.print("yetmish "); break;
            case 8: System.out.print("sakson "); break;
            case 9: System.out.print("to‘qson "); break;
        }

        // Birliklar
        switch (bir) {
            case 1: System.out.print("bir"); break;
            case 2: System.out.print("ikki"); break;
            case 3: System.out.print("uch"); break;
            case 4: System.out.print("to‘rt"); break;
            case 5: System.out.print("besh"); break;
            case 6: System.out.print("olti"); break;
            case 7: System.out.print("yetti"); break;
            case 8: System.out.print("sakkiz"); break;
            case 9: System.out.print("to‘qqiz"); break;
        }

    }
}
