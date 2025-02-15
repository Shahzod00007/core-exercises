package cases;

import java.util.Scanner;

public class Case06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N=");
        int N=scanner.nextInt();
        System.out.println("1: desimetr");
        System.out.println("2: kilometr");
        System.out.println("3: metr");
        System.out.println("4: millimetr");
        System.out.println("5: santimetr");
        System.out.print("Operatsiyani tanlang: ");
        int uzunlik = scanner.nextInt();
        switch (uzunlik){
            case 1:
                System.out.println(N/10);
                break;
            case 2:
                System.out.println(N*1000);
                break;
            case 3:
                    System.out.println("Natija: " + (N));
                break;
            case 4:
                System.out.println("Natija: " + (N/1000)+" metr");
                break;
            case 5:
                System.out.println("Natija: " + (N/100));
                break;
            default:
                System.out.println("Noto'g'ri operatsiya tanlandi.");

        }
    }
}
