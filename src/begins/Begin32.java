package begins;
import java.util.Scanner;
public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter T=");
        double T=scanner.nextDouble();
        double gradus=(T+32)*(5/9);
        System.out.printf("Farengeyt: %.2f°F -> Selsiy: %.2f°C\n", T, gradus);
    }
}
