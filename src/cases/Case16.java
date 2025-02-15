package cases;

import java.util.Scanner;

public class Case16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N=");
        int N=scanner.nextInt();

        if (N <=20 || N >= 69) {
            System.out.println("Noto‘g‘ri son! Faqat 20 dan 699 gacha bo‘lgan sonlarni kiriting.");
            return;
        }

        int on = (N % 100) / 10;
        int bir = N % 10;


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
