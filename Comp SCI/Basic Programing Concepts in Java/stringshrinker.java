//Activity 4 String Shrinker
//September 22 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String string = scan.nextLine();
        System.out.println("Enter number to subtract: ");
        int num = scan.nextInt();
        String newstring = string.substring(0, string.length() - num);
        System.out.println(newstring);
    }

}