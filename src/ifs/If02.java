package ifs;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N=");
        int N=scanner.nextInt();
        if(N>0){
            int d=N+1;
            System.out.println("d= "+d);
        }else {
            int c=N-2;
            System.out.println("c= "+c);
        }
    }
}
