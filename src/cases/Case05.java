package cases;

import java.util.Scanner;

public class Case05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A=");
        int A=scanner.nextInt();
        System.out.println("Enter B=");
        int B=scanner.nextInt();
        System.out.println("1: A + B");
        System.out.println("2: A - B");
        System.out.println("3: A / B");
        System.out.println("4: A * B");
        System.out.print("Operatsiyani tanlang: ");
        int amal = scanner.nextInt();
        switch (amal){
            case 1:
                System.out.println(A+B);
                break;
            case 2:
                System.out.println(A-B);
                break;
            case 3:
                if (B != 0) {
                System.out.println("Natija: " + (A / B));
            } else {
                System.out.println("Nolga bo'lish mumkin emas!");
            }
            break;
            case 4:
                System.out.println("Natija: " + (A * B));
                break;
            default:
                System.out.println("Noto'g'ri operatsiya tanlandi.");

        }
    }
}
