package begins;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  S=");
        double S=scanner.nextDouble();
        System.out.print("Enter  d=");
        double d=scanner.nextDouble();
        double  radusi=(S*4)/(d*d*3.14);
        System.out.println("radusi"+radusi);
    }
}
