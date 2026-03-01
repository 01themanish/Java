
import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num=sc.nextInt();

            if (num <= 1)
                System.out.println(num + " is Not a prime number");
            else {
                boolean isPrime = true;

                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    System.out.println(num + " is a Prime number");
                else
                    System.out.println(num + " is Not a Prime number");
            }

            sc.close();
        }
    }
}
