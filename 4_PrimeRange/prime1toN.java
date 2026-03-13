import java.util.Scanner;

public class prime1toN {
    public static void main() {
        try (Scanner sc=new Scanner(System.in)){
            System.err.print("Enter a number: ");
            int num=sc.nextInt();
            for(int i=2; i<=num; i++){
                boolean isPrime=true;
                for(int j=2; j<i; j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(i);
                }
            }
            sc.close();
        }
    }
}
