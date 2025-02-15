package booleans;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("N=");
        int N=scanner.nextInt();
        if((9<N && N<100) &&(N%2==0) ){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
