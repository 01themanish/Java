import java.util.Scanner;

public class star6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {

                    if (i == 1 || i == num || j == 1 || j == num) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        }
    }
    
}
