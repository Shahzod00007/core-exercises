package cases;

import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter R=");
        double R=scanner.nextDouble();
        System.out.println("1: Radus");
        System.out.println("2: Diametr");
        System.out.println("3: Aylana uzunligi");
        System.out.println("4: Doira yuzi ");
        System.out.println("Tanlovingizni kiriting: ");
        int tanlash = scanner.nextInt();

        switch (tanlash) {
            case 1:
                System.out.println("Radius: " + R);
                break;
            case 2:
                System.out.println("Diametr: " + (2 * R));
                break;
            case 3:
                System.out.println("Aylana uzunligi: " + (2 * Math.PI * R));
                break;
            case 4:
                System.out.println("Doira yuzi: " + (Math.PI * R * R));
                break;
            default:
                System.out.println("Noto'g'ri operatsiya tanladingiz!");
        }

    }
}
