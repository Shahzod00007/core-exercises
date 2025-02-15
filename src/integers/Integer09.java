package integers;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter N=");
        int N=scanner.nextInt();
        if(99<N && N<1000){
            int r100=N%1000/100;
            int r10=N/10;
            int r1=N%10;
            System.out.print("r100 "+r100);

        }else {
            System.out.println("N soni ikki xonali son emas:");
        }
    }
}
