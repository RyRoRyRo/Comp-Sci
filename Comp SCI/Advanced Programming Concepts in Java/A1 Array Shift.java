//A1 Shifting Array
//October 29 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Array = new int[8];
        int[] ShiftedArray = new int[8];
        int Ashift = 3;
        System.out.println("Please enter a number to shift by: ");
        Ashift = scanner.nextInt();

        System.out.println("Please enter 8 Numbers: ");
        for (int i = 0; i < 8; i++) {
            Array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            ShiftedArray[(i + Ashift) % 8] = Array[i];
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i + " New Array: " + ShiftedArray[i]);
        }
    }
}