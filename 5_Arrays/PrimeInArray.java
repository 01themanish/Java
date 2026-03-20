
import java.util.Scanner;

public class PrimeInArray {
    public static void main() {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("How many number you want to enter: ");
            int num=sc.nextInt();
            int arr[]=new int[num];
        
            //Element Insert in Array
            for(int i=0; i<num; i++){
                System.out.print("Enter "+(i+1)+" element: ");
                arr[i]=sc.nextInt();
            }

            System.out.print("Total Prime number in array is: ");
            for(int i=0; i<num; i++){
                boolean isPrime=true;
                for(int j=2; j<arr[i]; j++){
                    if(arr[i]%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
}
