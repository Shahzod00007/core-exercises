package begins;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter x=");
        double x=scanner.nextDouble();
        System.out.println("Enter Som  a=");
        double a=scanner.nextDouble();
        double d=a/x;
        System.out.println(" 1 kg konfet narxi d "+d);
        System.out.println("enter y=");
        double y=scanner.nextDouble();
        double c=d*y;
        System.out.println("c "+c);
    }
}
