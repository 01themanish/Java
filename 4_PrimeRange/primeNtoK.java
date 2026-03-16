
import java.util.Scanner;

public class primeNtoK {
    public static void main() {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter two numbers (n and k) to print prime numbers between them: ");
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n>1 && n<k){
                for(int i=n; i<=k; i++){
                    boolean isPrime=true;
                    for(int j=2; j<i; j++){
                        if(i%j==0){
                            isPrime=false;
                        }
                    }
                    if(isPrime){
                        System.err.println(i);
                    }
                }
            }
            else{
                System.err.println("Invalid Range!");
            }

        }
    }
}
