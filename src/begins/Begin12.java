package begins;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  a=");
        double a=scanner.nextDouble();
        System.out.print("Enter  b=");
        double b=scanner.nextDouble();
        double gipatenuza=Math.sqrt(a*a+b*b);
        System.out.println("gipatenuza"+gipatenuza);

        double peremetr=a+b+gipatenuza;
        System.out.println("peremtr"+peremetr);
    }
}
