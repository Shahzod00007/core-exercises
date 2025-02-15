package integers;

import java.util.Scanner;

public class Integer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A=");
      int A= scanner.nextInt();

        System.out.print("B=");
        int B= scanner.nextInt();

        if (A > B){
            int result = A % B;
            System.out.print(result + " qoldiq");
        }else {
            System.out.print("(A > B)");
        }
    }
}
