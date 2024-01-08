//A4 Product of Natural Numbers
//November 10 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i=0; i < 3; i++){
            System.out.println("Enter a number: ");
            int input = scan.nextInt();
            if (input < 1) {
                System.out.println("Please enter a positive number.");
                continue;
            }
            print_1_to_N_product(input);
        }
    }
    public static void print_1_to_N_product(int input) {
        int product = 1;
        for (int i = 1; i <= input; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
