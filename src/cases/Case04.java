package cases;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Oy=");
        int Oy=scanner.nextInt();
        switch (Oy){
            case 1:
                System.out.println("Yanvar-->31");
                break;
            case 2:
                System.out.println("Fevral-->28");
                break;
            case 3:
                System.out.println("Mart-->31");
                break;
            case 4:
                System.out.println("Aprel-->30");
                break;
            case 5:
                System.out.println("May-->31");
                break;
            case 6:
                System.out.println("Iyun-->30");
                break;
            case 7:
                System.out.println("Iyul-->31");
                break;
            case 8:
                System.out.println("Avgust-->31");
                break;
            case 9:
                System.out.println("Sentabr-->30");
                break;
            case 10:
                System.out.println("Oktabr-->31");
                break;
            case 11:
                System.out.println("Noyabr-->30");
                break;
            case 12:
                System.out.println("Dekabr-->31");
                break;
        }
    }
}
