package ifs;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x=");
        double x=scanner.nextDouble();
        double f;
        if(x<=0){
            f=-x;
        }else if(0<x && x<2){
            f=x*x;
        }else{
            f=4;
        }
        System.out.println("f(x)="+f);
    }
}
