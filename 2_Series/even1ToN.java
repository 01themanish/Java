import java.util.Scanner;

public class even1ToN {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            for(int i=1; i<=num; i++){
                System.out.println(i*2);
            }
            sc.close();
        }
    }
}
