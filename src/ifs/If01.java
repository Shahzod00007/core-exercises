package ifs;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N=");
        int N=scanner.nextInt();
        if(N>0){
            int d=N+1;
            System.out.println("d= "+d);
        }else {
            System.out.println("N "+N);
        }
    }
}
