package Begin;

import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("A kaifsent A!=0: ");
        double A=scanner.nextDouble();

        if(A==0){
            System.out.println("A nol bolmasligi kerak!");
        }else{
            System.out.println("B kaifsent:");
            double B=scanner.nextDouble();
            double x=-B/A;
            System.out.println("x "+x);
        }
    }
}
