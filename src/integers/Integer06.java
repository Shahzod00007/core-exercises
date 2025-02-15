package integers;

import java.util.Scanner;

public class Integer06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter N=");
        int N=scanner.nextInt();
        if(9<N && N<100){
            int r10=N%100/10;
            int r1=N%10/1;
            System.out.println("r10 "+r10);
            System.out.println("r1 "+r1);

        }else {
            System.out.println("N soni ikki xonali son emas:");
        }
    }
}
