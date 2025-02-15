package begins;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  X1=");
        double X1=scanner.nextDouble();
        System.out.print("Enter X2=");
        double X2=scanner.nextDouble();
        System.out.print("Enter Y1=");
        double Y1=scanner.nextDouble();
        System.out.print("Enter Y2=");
        double Y2=scanner.nextDouble();
        System.out.print("Enter Z1=");
        double Z1=scanner.nextDouble();
        System.out.print("Enter Z2=");
        double Z2=scanner.nextDouble();
        double a=Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
        System.out.println("a  "+a);
        double b=Math.sqrt((X2-X1)*(X2-X1)+(Z2-Z1)*(Z2-Z1));
        System.out.println("b  "+b);
        double c=Math.sqrt((Z2-Z1)*(Z2-Z1)+(Y2-Y1)*(Y2-Y1));
        System.out.println("c  "+c);
        double p=(a+b+c)/2;
        System.out.println("p "+p);
        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("S "+S);
    }
}
