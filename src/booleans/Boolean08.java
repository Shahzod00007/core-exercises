package booleans;

import java.util.Scanner;

public class Boolean08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("A=");
        int A=scanner.nextInt();
        System.out.print("B=");
        int B=scanner.nextInt();
        if(A%2!=0 && B%2!=0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
