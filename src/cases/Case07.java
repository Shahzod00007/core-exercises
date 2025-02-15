package cases;

import java.util.Scanner;

public class Case07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter M=");
        int M=scanner.nextInt();
        System.out.println("1: kilogram");
        System.out.println("2: milligram");
        System.out.println("3: gram");
        System.out.println("4: tonna");
        System.out.println("5: sentener");
        System.out.print("Operatsiyani tanlang: ");
        int uzunlik = scanner.nextInt();
        switch (uzunlik){
            case 1:
                System.out.println(M);
                break;
            case 2:
                System.out.println(M/Math.pow(10,6));
                break;
            case 3:
                System.out.println("Natija: " + (M/Math.pow(10,3)));
                break;
            case 4:
                System.out.println("Natija: " + (M*1000));
                break;
            case 5:
                System.out.println("Natija: " + (M*100));
                break;
            default:
                System.out.println("Noto'g'ri operatsiya tanlandi.");

        }
    }
}
