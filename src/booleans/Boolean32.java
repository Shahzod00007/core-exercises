package booleans;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        int a=scanner.nextInt();
        System.out.print("b=");
        int b=scanner.nextInt();
        System.out.print("c=");
        int c=scanner.nextInt();
        boolean Togriburchakli=(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)   || Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2)  || Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2));
        System.out.println("To'g'riburchakli "+Togriburchakli);
    }
}
