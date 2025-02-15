package ifs;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        System.out.println("Enter c=");
        int c=scanner.nextInt();
        int max = a;
        int min = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Eng kichik son --> " + min);
        System.out.println("Eng katta son --> " + max);
    }
}
