//ryan KS
//Password
//september 25

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String Username = scan.next();
        System.out.println("Enter Password: ");
        String Password = scan.next();
// getting Password

//checks passwords (CASE SENSITIVE)
        if(Password.equals("mci_password") && Username.equals("MCI")){
            System.out.println("Welcome User ''" + Username + "''");

        }
        else {
            System.out.println("Incorrect Username/Password");
        }
    }
}