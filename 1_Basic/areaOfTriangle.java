
import java.util.Scanner;

public class areaOfTriangle {
    public static void main() {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter height and base: ");
            double height=sc.nextDouble();
            double base=sc.nextDouble();
            double triangle=(height*base)/2.0;
            System.out.println("Area of triangle is: "+triangle);
            sc.close();
        }
    }
}
