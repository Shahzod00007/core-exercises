package booleans;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("N=");
        int N=scanner.nextInt();
        if((99<N && N<1000) &&(N%2!=0) ){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
