package Begin;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  A=");
        double A=scanner.nextDouble();
        System.out.print("Enter B=");
        double B=scanner.nextDouble();
        System.out.print("Enter C=");
        double C=scanner.nextDouble();
        double ACkesma=Math.abs(C-A);
        double BCkesma=Math.abs(C-B);
        double ACvaBCkopaytma=Math.abs(ACkesma*BCkesma);
        System.out.println("ACkesma "+ACkesma);
        System.out.println("BCkesma "+BCkesma);
        System.out.println("ACvaBCkopaytma  "+ACvaBCkopaytma);
    }
}
