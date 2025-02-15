package ifs;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  N=");
        int N=scanner.nextInt();
        if(N>0 && N%2==1){
            System.out.println("Musbat toq son-->N");
        }else if(N<0 && N%2==0){
            System.out.println("Manfiy juft son-->N");
        }else if(N==0 ){
            System.out.println("Nol son-->N");
        }
    }
}
