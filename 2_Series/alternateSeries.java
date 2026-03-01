import java.util.Scanner;

public class alternateSeries {
    public static void main() {
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            int sum=0;
            
            for(int i=1; i<=num; i++){
                if(i%2==0){
                    System.out.print("- " + i + " ");
                    sum-=i;
                }
                else{
                    if(i!=1)
                        System.out.print("+ ");
                    System.out.print(i + " ");
                    sum = sum + i;
                }
            }
            System.out.println("\nSum = " + sum);
            sc.close();
        }
    }
}
