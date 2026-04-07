import java.util.Scanner;

public class star8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= 2 * num; j++) {

                    if (j <= i || j > 2 * num - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }

            for (int i = num; i >= 1; i--) {
                for (int j = 1; j <= 2 * num; j++) {

                    if (j <= i || j > 2 * num - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
}
