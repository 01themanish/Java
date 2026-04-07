import java.util.Scanner;

public class star7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num * 2 - 1; j++) {

                    if (j >= num + 1 - i && j <= num - 1 + i &&
                       (i == num || j == num + 1 - i || j == num - 1 + i)) {
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
