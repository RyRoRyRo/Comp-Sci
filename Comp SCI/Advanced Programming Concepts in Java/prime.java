//A4 Prime Number Checker
//November 10 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i=0; i < 2; i++){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            boolean isPrime = is_prime_number(num);
            if (isPrime) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
    public static boolean is_prime_number(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}