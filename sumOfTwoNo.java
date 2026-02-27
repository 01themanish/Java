import java.util.Scanner;
public class sumOfTwoNo{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        sumOfTwoNo obj=new sumOfTwoNo();
        System.out.print("Enter any two number: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sum of "+x+" + "+y+" = "+obj.sum(x, y));
    }
    public int sum(int x, int y){
        return x+y;
    }
}