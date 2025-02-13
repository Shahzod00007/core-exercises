package Begin;
import java.util.Scanner;
public class Begin24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a =");
        double a=scanner.nextDouble();
        System.out.println("b=");
        double b=scanner.nextDouble();
        System.out.println("c=");
        double c=scanner.nextDouble();
        double d=c;
        c=b;
        b=a;
        a=d;
        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c);
    }
}
