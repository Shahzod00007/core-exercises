package booleans;

import java.util.Scanner;

public class Boolean04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter A=");
        int A=scanner.nextInt();
        System.out.print("Enter B=");
        int B=scanner.nextInt();
        boolean shart=(A>2)&&(B<=3);
        System.out.println(" "+shart);

    }
}
