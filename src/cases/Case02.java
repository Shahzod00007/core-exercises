package cases;

import java.util.Scanner;

public class Case02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter K=");
        int K=scanner.nextInt();
        switch (K){
            case 1:
                System.out.println("1-->Yomon");
                break;
            case 2:
                System.out.println("2-->Qoniqarsiz");
                break;
            case 3:
                System.out.println("3-->Qoniqarli");
                break;
            case 4:
                System.out.println("4-->Yaxshi");
                break;
                case 5:
                System.out.println("5-->Alo'");
                break;
        }
    }
}
