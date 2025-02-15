package booleans;

import java.util.Scanner;

public class Boolean06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("A=");
        int A=scanner.nextInt();
        System.out.print("B=");
        int B=scanner.nextInt();
        System.out.print("C=");
        int C=scanner.nextInt();
        boolean Shart=(A<=B)&&(B<=C)&&(A<=C);
        System.out.println("Shart botich "+Shart);
    }
}
