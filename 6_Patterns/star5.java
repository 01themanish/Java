import java.util.Scanner;

public class star5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2*n - 1; i++) {

            int row = (i <= n) ? i : 2*n - i;

            for(int j = 1; j <= n + row - 1; j++) {
                if(j <= n - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}