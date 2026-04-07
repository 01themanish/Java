import java.util.Scanner;

public class star10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int num = sc.nextInt();

            for(int i=1; i<=num; i++){
                for(int j=1; j<=num*2-1; j++){
                    if(j>=i && j<=num*2-i &&
                    (i==1 || j==i || j==num*2-i))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
