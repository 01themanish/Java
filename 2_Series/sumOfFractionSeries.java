
import java.util.Scanner;

public class sumOfFractionSeries {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            double result=0;
            for(int i=1; i<=num; i++){
                result+= (double) i/(i+1);
            }
            System.out.println("Sum of series = " + result);
            sc.close();
        }
    }
}
