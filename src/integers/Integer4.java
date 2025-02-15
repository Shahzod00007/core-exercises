package integers;

import java.util.Scanner;

public class Integer4 {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.print("A (A>B) Enter A=");
        double A=scanner.nextInt();
        System.out.print("Enter B=");
        double B=scanner.nextInt();
        if(A<=B){
            System.out.println("A nuqta uzunligi B nuqta uzunligidan katta bolishi kerak");
        }else{
            double N=A/B;
            System.out.println("N "+N);
        }
    }

}
