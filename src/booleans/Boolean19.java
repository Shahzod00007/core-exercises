package booleans;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("A=");
        int A=scanner.nextInt();
        System.out.print("B=");
        int B=scanner.nextInt();
        System.out.print("C=");
        int C=scanner.nextInt();
        if((A==B  )||( B==C)||(A==C)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
