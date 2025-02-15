package ifs;

import java.util.Scanner;

public class If07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        int kichik=Math.min(a,b);
        System.out.println("kichik son "+kichik);
        if (a < b) {
            System.out.println("Kichik son: 1-son (" + a + ")");
        } else if (b < a) {
            System.out.println("Kichik son: 2-son (" + b + ")");
        } else {
            System.out.println("Ikkala son teng (" + a + ")");
        }
    }
}
