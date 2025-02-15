package ifs;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x=");
        int x=scanner.nextInt();
        System.out.println("Enter y=");
        int y=scanner.nextInt();
        if(x==0 && y==0){
            System.out.println("kordinata boshida-->>0");
        }else if(x==0 ){
            System.out.println("kordinata oqida joylashgan-->>1");
        } else if(y==0 ){
            System.out.println("kordinata oqida joylashgan-->>2");
        }else{
            System.out.println("kordinata oqida joylashmagan-->>3");
        }
    }
}
