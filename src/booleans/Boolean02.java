package booleans;

import java.util.Scanner;

public class Boolean02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A=");
        int A=scanner.nextInt();
        boolean toq=A%2!=0;
        System.out.println("toq son "+toq);
    }
}
