package ifs;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=scanner.nextInt();
        System.out.println("Enter b=");
        int b=scanner.nextInt();
        System.out.println("Enter c=");
        int c=scanner.nextInt();
        int ab=Math.abs(a-b);
        int ac=Math.abs(a-c);
       if(ab>ac){
           System.out.println("Eng yaqin nuqta-->C");
           System.out.println("Eng yaqin nuqta bilan masofa-->"+ac);
       }else{
           System.out.println("Eng yaqin nuqta-->B");
           System.out.println("Eng yaqin nuqta bilan masofa-->"+ab);
       }


    }
}
