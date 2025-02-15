package ifs;

import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        System.out.println("Enter c=");
        int c=scanner.nextInt();
        int musbat=0;
        int manfiy=0;
        if(a>0){
            musbat++;
        }else if(a<0){
            manfiy++;
        }
        if(b>0){
            musbat++;
        }else if(b<0){
            manfiy++;
        }
        if(c>0){
            musbat++;
        }else if(c<0){
            manfiy++;
        }
        System.out.println("musbat son="+musbat);
        System.out.println("manfiy son="+manfiy);
    }
    }
