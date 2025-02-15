package ifs;

import java.util.Scanner;

public class If08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        int kattasi=Math.max(a,b);
        int kichik=Math.min(a,b);
        System.out.println("katta son "+kattasi);
        System.out.println("kichik son "+kichik);
    }
}
