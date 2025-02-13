package Begin;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  X1=");
        double X1=scanner.nextDouble();
        System.out.print("Enter X2=");
        double X2=scanner.nextDouble();
        System.out.print("Enter Y1=");
        double Y1=scanner.nextDouble();
        System.out.print("Enter Y2=");
        double Y2=scanner.nextDouble();
        //ikkinuqtaorasigagimasofa=>d
        double d=Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
        System.out.println("d  "+d);
    }
}
