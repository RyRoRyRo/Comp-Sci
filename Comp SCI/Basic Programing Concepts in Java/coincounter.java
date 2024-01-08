//coin counter
//September 25
//RKS

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// take input
        System.out.print("Enter an amount in cents (0-100): ");
        int amount = scanner.nextInt();

        if (amount < 0 || amount > 100) {
            System.out.println("Invalid input. Please enter an amount between 0 and 100.");
            //if invalid stop everything
        } else {
            int quarters = amount / 25;
            int remainder = amount % 25;
// taking remainders of the devisions in order to calculate how many of the next smallest coin there is
            int dimes = remainder / 10;
            remainder %= 10;

            int nickels = remainder / 5;
            int pennies = remainder % 5;

            System.out.println("quarters - " + quarters);
            System.out.println("dimes - " + dimes);
            System.out.println("nickels - " + nickels);
            System.out.println("pennies - " + pennies);
            // output
        }
    }
}