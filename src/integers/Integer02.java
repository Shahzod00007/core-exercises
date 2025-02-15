package integers;

import java.util.Scanner;

public class Integer02 {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.print("Enter M=");
        double M=scanner.nextDouble();
        double d=M/1000;
        System.out.println("d "+d);
    }
}
