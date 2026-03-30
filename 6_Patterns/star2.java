import java.util.Scanner;

public class star2 {
    public static void main() {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("How many row you want to print: ");
            int num=sc.nextInt();
            for(int i=1; i<=num; i++){
                for(int j=1; j<=num; j++){
                    if(j>=num+1-i && j<=num){
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
