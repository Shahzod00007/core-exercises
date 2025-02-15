package begins;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter v1=");
        double v1=scanner.nextDouble();
        System.out.println("Enter Som  t1=");
        double t1=scanner.nextDouble();
        System.out.println("enter v2=");
        double v2=scanner.nextDouble();
        System.out.println("Enter Som  t2=");
        double t2=scanner.nextDouble();
        double oqimboylab=(v1+v2)*t1;
        double oqimgaqarshi=(v1-v2)*t2;
        System.out.println(" oqimboylab "+oqimboylab);
        System.out.println(" oqimgaqarshi "+oqimgaqarshi);
    }
}
