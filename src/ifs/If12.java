package ifs;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        System.out.println("Enter c=");
        int c=scanner.nextInt();
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("eng kichik son-->"+min);

    }
}
