import java.util.Scanner;

public class areaOfCirle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter radius: ");
        double r=sc.nextDouble();
        double ar=Math.PI*r*r;
        System.out.println("Area of circle is: "+ar);
        sc.close();
    }
    }
    
}
