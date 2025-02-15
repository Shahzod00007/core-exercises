package ifs;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        if(a!=b){
            int c=Math.max(a,b);
            System.out.println("Tartiblangan qiymatlar: a = " + c + ", b = " + c);
        }else if(a==b){
            int c=0;
            System.out.println("Tartiblangan qiymatlar: a = " + c + ", b = " + c);
        }

    }
}
