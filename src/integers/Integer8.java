package integers;

import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter N=");
        int N=scanner.nextInt();
        if(9<N && N<100){
            int r10=N/10;
            int r1=N%10;
            int d=r1*10+r10;
            System.out.print("d "+d);

        }else {
            System.out.println("N soni ikki xonali son emas:");
        }
    }
}
