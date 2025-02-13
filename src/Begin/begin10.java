package Begin;

import java.util.Scanner;

public class begin10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  a=");
        double a=scanner.nextDouble();
        System.out.print("Enter  b=");
        double b=scanner.nextDouble();
        double yigindi=a+b;
        double kopaytma=a* b;
        double anikvadrati=a*a;
        double bnikvadrati=b*b;
        System.out.println("yigindi"+yigindi);
        System.out.println("kopaytma"+kopaytma);
        System.out.println("anikvadrati"+anikvadrati);
        System.out.println("bnikvadrati"+bnikvadrati);

    }
}
