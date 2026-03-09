
import java.util.Scanner;

public class Armstrong {
    public static void main() {
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            int n=num;
            int num1=num;
            int count=0;
            while(n!=0){
                n=n/10;
                count++;
            }
            int digit;
            int result=0;
            while(num1!=0){
                digit=num1%10;
                result+=Math.pow(digit,count);
                num1=num1/10;
            }
            if(num==result)
                System.out.println(" It is Armstrong number");
            else
                System.out.println("It is not Armstrong number");
        }
        
    }
}
