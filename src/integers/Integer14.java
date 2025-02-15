package integers;

import java.util.Scanner;

public class Integer14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter N=");
        int N=scanner.nextInt();
        if(99<N && N<1000){
            int r100=N%1000/100;
            int r10=N%100/10;
            int r1=N%10;
            int d=r100*10+r10+r1*100;
            System.out.println("d "+d);

        }else {
            System.out.println("N soni ikki xonali son emas:");
        }
    }
}
