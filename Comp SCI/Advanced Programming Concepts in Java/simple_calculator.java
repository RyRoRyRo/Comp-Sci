//A4 Simple Calculator
//November 10 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int timesUsed = 0;
        for (int i=0; i < 4; i++){
            try {
                System.out.println("Enter an operation (a, s, m, d): ");
                String operation = scan.next();
                System.out.println("Enter a number: ");
                int num1 = scan.nextInt();
                System.out.println("Enter another number: ");
                int num2 = scan.nextInt();
                calculate(operation, num1, num2);
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }

    public static void calculate(String operation, int num1, int num2) {
        switch (operation) {
            case "a":
                System.out.println(num1 + num2);
                break;
            case "s":
                System.out.println(num1 - num2);
                break;
            case "m":
                System.out.println(num1 * num2);
                break;
            case "d":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}