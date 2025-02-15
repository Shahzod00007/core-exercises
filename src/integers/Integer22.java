package integers;

import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N=");
        int N=scanner.nextInt();
        int soat=N/3600;
        int sekund=N%60;
        System.out.println("soat "+soat);
        System.out.println("sekund "+sekund);
    }
}
