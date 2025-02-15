package booleans;

import java.util.Scanner;
public class Boolean14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a=");
        int a = scanner.nextInt();

        System.out.print("b=");
        int b = scanner.nextInt();

        System.out.print("c=");
        int c = scanner.nextInt();

        if (((a > 0) && (b <= 0) && (c <= 0)) ||
                ((b > 0) && (a <= 0) && (c <= 0)) ||
                ((c > 0) && (a <= 0) && (b <= 0))){
            System.out.print(true);

        }else{
            System.out.print(false);
        }
    }
}
