import java.util.Scanner;

public class fahrenheitToCel {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter Fahrenheit: ");
            double Fahrenheit=sc.nextDouble();
            double celcius=(Fahrenheit-32)/1.8;
            System.out.printf("Celcius is: %.2f\n",celcius);
            sc.close();
        }
    }
}
