import java.util.Scanner;
public class sortArray {
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

            for(int i=0; i<num; i++){
                for(int j=i+1; j<num; j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

            for(int i=0; i<num; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
