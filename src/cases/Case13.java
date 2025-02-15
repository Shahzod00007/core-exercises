package cases;

import java.util.Scanner;

public class Case13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Katet a");
        System.out.println("2: Gipotenuza c");
        System.out.println("3: Balandlik h");
        System.out.println("4: Yuza S");
        System.out.print("Qaysi element berilgan (1-4): ");

        int tanlov = scanner.nextInt();
        double a = 0, c = 0, h = 0, S = 0;
        switch (tanlov) {
            case 1:
                System.out.print("Katetni kiriting (a): ");
                a = scanner.nextDouble();
                c = a * Math.sqrt(2);
                h = c / 2;
                S = (c * h) / 2;
                break;
            case 2:
                System.out.print("Gipotenuzani kiriting (c): ");
                c = scanner.nextDouble();
                a = c / Math.sqrt(2);
                h = c / 2;
                S = (c * h) / 2;
                break;
            case 3:
                System.out.print("Balandlikni kiriting (h): ");
                h = scanner.nextDouble();
                c = 2 * h;
                a = c / Math.sqrt(2);
                S = (c * h) / 2;
                break;
            case 4:
                System.out.print("Yuzani kiriting (S): ");
                S = scanner.nextDouble();
                c = Math.sqrt(4 * S);
                h = c / 2;
                a = c / Math.sqrt(2);
                break;
            default:
                System.out.println("Noto‘g‘ri tanlov!");
                return;
        }

        System.out.println("\nNatijalar:");
        System.out.println("Katet a = " + a);
        System.out.println("Gipotenuza c = " + c);
        System.out.println("Balandlik h = " + h);
        System.out.println("Yuza S = " + S);
    }
}
