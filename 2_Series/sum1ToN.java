import java.util.Scanner;
public class sum1ToN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter value of n: ");
            int n = sc.nextInt();
            int sum = 0;
            
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("Total: "+sum);
            sc.close();
        }
    }
}
