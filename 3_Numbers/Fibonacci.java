import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            int a=0,b=1,c;
            for(int i=0; i<num; i++){
                c=a;
                a=b;
                b=c+b;
                System.out.print(c+" ");
            }
            System.out.println();
            sc.close();
        }
    }
}
