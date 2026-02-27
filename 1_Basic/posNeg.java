import java.util.Scanner;

public class posNeg {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            if(num>0)
                System.out.println(num+" is a positve number");
            else if(num<0)
                System.out.println(num+" is a negative number");
            else
                System.out.println(num+" is a non_positve number");
        }
    }
}
