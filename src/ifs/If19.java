package ifs;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        System.out.println("Enter c=");
        int c=scanner.nextInt();
        System.out.println("Enter d=");
        int d=scanner.nextInt();
        if (a==b  && b==c &&  a!= d) {
            System.out.println("Qolgan son tartib raqami-->4");
        }else  if (a==b  && a==d &&   a!= c) {
            System.out.println("Qolgan son tartib raqami-->3");
        }else  if (a==c  && a==d && a!= b) {
            System.out.println("Qolgan son tartib raqami-->2");
        }else  if (b==d  && b==c && c!= a) {
            System.out.println("Qolgan son tartib raqami-->1");
        }
    }
}
