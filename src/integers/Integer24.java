package integers;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entert k(1<=k<=365=)");
        int  k=scanner.nextInt();
        // 1-yanvar->dushanba(1)
        // 2-yanvar->Seshanba(2)
        // 3-yanvar->Chorshanba(3)
        // 4-yanvar->Payshanba(4)
        // 5-yanvar->juma(5)
        // 6-yanvar->shanba(6)
        // 7-yanvar->Yakshanba(0)
        // 8-yanvar->Dushanba(1)
        int  kun=k%7;
        System.out.println("K- kun haftaning qaysi kuniga togri keladi-->"+kun);
    }
}
