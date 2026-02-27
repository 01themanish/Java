import java.util.Scanner;
public class swapUsing3rdVar {
    public static void main(){
        try (Scanner sc=new Scanner(System.in)) {
            System.out.print("Enter any two numbers: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Before Swapping: "+a+" "+b);
            int c=a;
            a=b;
            b=c;
            System.out.println("After Swapping: "+a+" "+b);
            sc.close();
        }
    }
}
