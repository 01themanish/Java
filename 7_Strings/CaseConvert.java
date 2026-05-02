
import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String: ");
        String str = sc.nextLine();
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);
    }
}