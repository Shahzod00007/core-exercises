package ifs;

import java.util.Scanner;

public class If16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        System.out.println("Enter c=");
        int c=scanner.nextInt();
        if(a<b && b<c){
            System.out.println("ikkilangani-->"+(a*2));
            System.out.println("ikkilangani-->"+(b*2));
            System.out.println("ikkilangani-->"+(c*2));
        }else{
            System.out.println("teskarisi ishoralisi-->"+(a*(-1)));
            System.out.println("teskarisi ishoralisi-->"+(b*(-1)));
            System.out.println("teskarisi ishoralisi-->"+(c*(-1)));
        }
    }
}
