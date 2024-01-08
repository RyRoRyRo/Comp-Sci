//Activity 7 Collatz Conjecture
//Oct 6 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int num = scan.nextInt();
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                System.out.print(num + ", ");
            } else {
                num = (num * 3) + 1;
                System.out.print(num + ", ");

            }

        }

    }
}