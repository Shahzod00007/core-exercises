package booleans;

import java.util.Scanner;

public class Boolean01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A=");
        int A=scanner.nextInt();
        boolean result = A >= 0;
        System.out.println(result);
        System.out.println("musbat sont "+result);
    }
}
