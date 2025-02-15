package ifs;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x=");
        int x=scanner.nextInt();
        System.out.println("Enter y=");
        int y=scanner.nextInt();
        if(x>0 && y>0){
            System.out.println("chorak-->1");
        }else if(x<0 && y>0) {
            System.out.println("chorak-->2");
        }else if(x<0 && y<0) {
            System.out.println("chorak-->3");
        }else if(x>0 && y<0) {
            System.out.println("chorak-->4");
        }
    }
}
