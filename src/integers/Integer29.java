package integers;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.print(" Enter a=");
        int a=scanner.nextInt();
        System.out.print("Enter b=");
        int b=scanner.nextInt();
        System.out.print("Enter c=");
        int  c=scanner.nextInt();
        int n=(a/c)+(b/c);
        System.out.println("Number of squares:"+n);
        int unusedArea=a*b-n*c*c;
        System.out.println("unused area:"+unusedArea);
    }
}
