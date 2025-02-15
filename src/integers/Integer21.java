package integers;

import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entert N=");
        int N=scanner.nextInt();
        int soat = N / 3600;
        int minut = (N % 3600) / 60;
        int sekund = N % 60;
        System.out.println("minut "+minut);
        System.out.println("sekund "+sekund);
    }
}
