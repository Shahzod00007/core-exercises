package begins;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter x=");
        double x=scanner.nextDouble();
        System.out.println("Enter Som  a=");
        double a=scanner.nextDouble();
        double d=a/x;
        System.out.println("enter y=");
        double y=scanner.nextDouble();
        System.out.println("Enter Som  b=");
        double b=scanner.nextDouble();
        double c=b/y;
        System.out.println(" 1 kg shokolad narxi d "+d);
        System.out.println(" 1 kg konfet narxi c "+c);
        double f=d-c;
        System.out.println("f "+f);
    }
}
