import java.util.Scanner;

public class sumOfCubes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int n = num;
            int digit;
            int result = 0;
            while(num != 0){
                digit = num % 10;
                result += Math.pow(digit, 3);
                num /= 10;
            }
            System.out.println("Sum of cubes of digits of " + n + " = " + result);
            sc.close();
        }
        
        
    }
}