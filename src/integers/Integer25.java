package integers;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entert k(1<=k<=365=)");
        int  k=scanner.nextInt();
        // 1-yanvar->Seshanba(2)
        // 2-yanvar->Chorshanba(3)
        // 3-yanvar->Payshanba(4)
        // 4-yanvar->juma(5)
        // 5-yanvar->shanba(6)
        // 6-yanvar->Yakshanba(7)
        // 7-yanvar->dushanba(1)
        // 8-yanvar->Seshanba(2)
        int  kun=k%7+1;
        System.out.println("K- kun haftaning qaysi kuniga togri keladi-->"+kun);
    }
}
