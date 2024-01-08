//A2 Count 2 Digit numbers in an Array
//October 30 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        System.out.println("Enter Array Values: ");
        for (int i = 0; i < 10; i++) {
            values[i] = scanner.nextInt();
        }
        int numberOfDoubleDigits = 0;
        // Loop through every single element in the array
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 10 && values[i] <= 99) {
                numberOfDoubleDigits++;
            }
        }

        System.out.println("There are " + numberOfDoubleDigits + " numbers with 2 digits.");
    }
}

