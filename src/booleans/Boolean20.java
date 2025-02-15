package booleans;

import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("N=");
        int N=scanner.nextInt();
        int r1=N%1000/100;
        int r2=N%100/10;
        int r3=N%10/1;
        if((99<N && N<1000) &&(r1!=r2 && r2!=r3) ){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
