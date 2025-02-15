package Begin;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  a=");
        double a=scanner.nextDouble();
        System.out.print("Enter  b=");
        double b=scanner.nextDouble();
        double yuza=a*b;
        double peremetr=2*(a+b);
        System.out.println("yuza "+yuza);
        System.out.println("peremetr "+peremetr);
    }

}
