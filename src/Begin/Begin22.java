package Begin;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a=");
        double a=scanner.nextDouble();
        System.out.println("Enter b=");
        double b=scanner.nextDouble();
        double d=a;
        a=b;
        b=d;
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
