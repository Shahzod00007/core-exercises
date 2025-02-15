package cases;

import java.util.Scanner;

public class Case14 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


        System.out.println("1: tamoni a");
        System.out.println("2: ichki chizzilgan aylana R1");
        System.out.println("3: Tashqi chizilgan aylana R2 h");
        System.out.println("4: Yuza S");
        System.out.print("Qaysi element berilgan (1-4): ");

        int tanlov = scanner.nextInt();
        double a = 0, R1 = 0, R2 = 0, S = 0;

        switch (tanlov) {
            case 1:
                System.out.print("Katetni kiriting (a): ");
                a = scanner.nextDouble();
                R1=a*Math.sqrt(3);
                R2 = 2*R1;
                S = Math.pow(a,2)*Math.sqrt(3)/4;
                break;
            case 2:
                System.out.print("ichki chizzilgan aylana (R1): ");
                R1 = scanner.nextDouble();
                a = R1/ Math.sqrt(3);
                R2=2*R1;
                S = R1/ Math.sqrt(3)*Math.sqrt(3)/4;
                break;
            case 3:
                System.out.print("Tashqi chizilgan aylana (R2): ");
                R2 = scanner.nextDouble();
                a=R2/(2*Math.sqrt(3));
               R1=R2/2;
                S =Math.pow(R2/(2*Math.sqrt(3)),2)*Math.sqrt(3)/4 ;
                break;
            case 4:
                System.out.print("Yuzani kiriting (S): ");
                S = scanner.nextDouble();
               a=Math.sqrt((S/(Math.sqrt(3)/4)));
                R1=S * Math.sqrt(3)*Math.sqrt(3)/4;;
                R2=2*S * Math.sqrt(3)*Math.sqrt(3)/4;;;
                break;
            default:
                System.out.println("Noto‘g‘ri tanlov!");
                return;
        }

        System.out.println("\nNatijalar:");
        System.out.println("Katet a = " + a);
        System.out.println("Ichki chizilgan aylana R1 = " + R1);
        System.out.println("Tashqi chizilgan aylana R2 = " + R2);
        System.out.println("Yuza S = " + S);
    }
}
