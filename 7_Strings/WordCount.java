import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String: ");
        String str = sc.nextLine();
        
        String words[] = str.split(" ");
        System.out.println("Word Count: " + words.length);
    }
}
