//Error Check 1: Email
//Oct 19 2023
//Ryan KS
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scan.nextLine();
        if (!email.contains("@")) {
            System.out.println("Invalid email: Invalid Address (Missing '@')");
            return;
        }
        if (!email.contains(".")) {
            System.out.println("Invalid email: Invalid Domain (Missing '.')");
            return;
        }
        if (email.length() == 0) {
            System.out.println("Invalid email: empty");
            return;
        }
        String domain = email.substring(email.indexOf("@") + 1);
        String username = email.substring(0, email.indexOf("@"));
        System.out.println("Your email is: " + email);
        System.out.println("Your username is: " + username);
        System.out.println("Your domain is: " + domain);
    }

}