package booleans;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        int a=scanner.nextInt();
        System.out.print("b=");
        int b=scanner.nextInt();
        boolean result = (a + b) % 2 == 0 ;
        System.out.print(result);
    }
}
