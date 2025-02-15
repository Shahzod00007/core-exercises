package ifs;

import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        if(a>b){
            int c=a;
            a=b;
            b=c;
        }
        System.out.println("Tartiblangan qiymatlar: a = " + a + ", b = " + b);
    }
}
