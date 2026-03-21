
import java.util.Scanner;

public class star1 {
    public static void main() {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("How many row you want to print: ");
            int num=sc.nextInt();
            for(int i=0; i<num; i++){
                for(int j=0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
