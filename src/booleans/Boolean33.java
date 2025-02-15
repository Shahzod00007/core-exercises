package booleans;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        int a=scanner.nextInt();
        System.out.print("b=");
        int b=scanner.nextInt();
        System.out.print("c=");
        int c=scanner.nextInt();
        boolean uchburchakMumkin = (a + b > c && a + c > b && b + c > a);
        System.out.println("Uchburchak mumkin degan  "+uchburchakMumkin);
    }
}
