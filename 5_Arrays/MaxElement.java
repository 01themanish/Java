import java.util.Scanner;

public class MaxElement {
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

            //Searching 
            int max=arr[0];
            for(int i=0; i<num; i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            System.out.println("Greatest element in array is: "+max);
        }
    }
}
