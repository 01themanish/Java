import java.util.Scanner;

public class factorial {
    public static void main(){
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            int fact=1;
            for(int i=1; i<=num; i++){
                fact*=i;
            }
            System.out.println("Facotorial of "+num+" is: "+fact);
            sc.close();
        }
    }
}
