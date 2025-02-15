package begins;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter A=");
        double A=scanner.nextDouble();
        double kv=Math.pow(A,2);
        double uch=Math.pow(A,3);
        double besh=Math.pow(A,5);
        double on=Math.pow(A,10);
        double onbesh=Math.pow(A,15);
        System.out.println("kv "+kv);
        System.out.println("uch "+uch);
        System.out.println("besh "+besh);
        System.out.println("on "+on);
        System.out.println("onbesh "+onbesh);
    }
}
