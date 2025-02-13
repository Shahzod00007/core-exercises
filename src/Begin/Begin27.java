package Begin;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter A=");
        double A=scanner.nextDouble();
        double kv=Math.pow(A,2);
        double tort=Math.pow(A,4);
        double sakkiz=Math.pow(A,8);
        System.out.println("kv"+kv);
        System.out.println("tort"+tort);
        System.out.println("sakkiz"+sakkiz);
    }
}
