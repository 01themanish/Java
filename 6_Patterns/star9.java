import java.util.Scanner;

public class star9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int num = sc.nextInt();

            for(int i=1; i<=num; i++){
                for(int j=1; j<=i; j++){
                    if(j==1 || j==i || i==num)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
