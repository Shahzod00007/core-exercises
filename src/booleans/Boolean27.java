package booleans;

import java.util.Scanner;

public class Boolean27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("x=");
        double x=scanner.nextDouble();
        System.out.print("y=");
        double y=scanner.nextDouble();
        if( (x<0 && y<0 ) || (x<0 && y>0)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}
