package Begin;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  A=");
        double A=scanner.nextDouble();
        System.out.print("Enter B=");
        double B=scanner.nextDouble();
        System.out.print("Enter C=");
        double C=scanner.nextDouble();
        double ABkesma=Math.abs(B-A);
        double BCkesma=Math.abs(C-B);
        double ABCsum=Math.abs(A+C+B);
        System.out.println("ABkesma"+ABkesma);
        System.out.println("BCkesma"+BCkesma);
        System.out.println("ABCsum"+ABCsum);
    }
}
