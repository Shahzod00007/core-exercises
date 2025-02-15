package integers;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("yil=");
        int yil=scanner.nextInt();
        int asr = (yil - 1) / 100 + 1;
        int boshlangich_yil = (asr - 1) * 100 + 1;
        System.out.println(yil + " yil - " + asr + "-asrga tegishli.");
        System.out.println(asr + "-asrning boshlanishi: " + boshlangich_yil + " yil.");

    }
}
