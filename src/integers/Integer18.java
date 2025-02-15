package integers;

import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("N=");
        int N = scanner.nextInt();

        if (N < 9999){
            int result = N / 1000;
            System.out.println("Result= " + result);
        }else {
            System.out.println("N < 999 bo'lishi kerak!");
        }
    }
}
