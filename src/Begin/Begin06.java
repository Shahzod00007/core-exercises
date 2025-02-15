package Begin;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  a=");
        double a=scanner.nextDouble();
        System.out.print("Enter  b=");
        double b=scanner.nextDouble();
        System.out.print("Enter  c=");
        double c=scanner.nextDouble();
        double hajmi=a*b*c;
        double tolasirti=2*(a*b+b*c+c*a);
        System.out.println("hajmi "+hajmi);
        System.out.println("tolasirti "+tolasirti);
    }

}
