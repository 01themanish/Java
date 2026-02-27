
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Average obj=new Average();
        System.out.print("Enter any three number: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println("Average of "+x+", "+y+" and "+z+" is: "+obj.AverageofNumbers(x, y, z));
        sc.close();
    }
    public double  AverageofNumbers(int x, int y, int z){
        int total=x+y+z;
        double avg=total/3.0;
        return avg;
    }
}
