package Begin;

import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter v1=");
        double v1=scanner.nextDouble();
        System.out.println("enter v2=");
        double v2=scanner.nextDouble();
        System.out.println("Enter Som  t1=");
        double t1=scanner.nextDouble();
        System.out.println("Enter Som  S=");
        double S=scanner.nextDouble();
        double S1=S-(v1+v2)*t1 ;
        System.out.println(" S1 "+S1);
    }
}
