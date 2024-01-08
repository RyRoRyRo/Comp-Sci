//Activity 4 Email Analyzer
//September 22 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scan.nextLine();
        String domain = email.substring(email.indexOf("@") + 1);
        String username = email.substring(0, email.indexOf("@"));
        System.out.println("Your email is: " + email);
        System.out.println("Your username is: " + username);
        System.out.println("Your domain is: " + domain);
    }

}
