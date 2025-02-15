package ifs;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        System.out.println("Enter c=");
        int c=scanner.nextInt();
        if (a==b  &&  a!= c) {
            System.out.println("Qolgan son tartib raqami-->3");
        }else  if (c==b  &&  b!= a) {
            System.out.println("Qolgan son tartib raqami-->1");
        }else  if (a==c  &&  a!= b) {
            System.out.println("Qolgan son tartib raqami-->2");
        }
    }
}
