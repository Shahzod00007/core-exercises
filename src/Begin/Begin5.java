package Begin;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a=");
        double  a=scanner.nextDouble();
        double hajmi=a*a*a;
        double Tolasirti=6*a*a;
        System.out.println("hajmi"+hajmi);
        System.out.println("Tolasirti"+Tolasirti);
    }
}
