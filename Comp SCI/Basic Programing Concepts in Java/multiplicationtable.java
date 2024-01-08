//Activity 7 Multiplication Table
//Oct 6 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lower bound: ");
        int A = scan.nextInt();
        System.out.println("Enter higher bound: ");
        int B = scan.nextInt();
        System.out.println("Enter Multiplier: ");
        float N = scan.nextFloat();
        for (int i=A; i <= B; i++) {
            float num = N*i;
            System.out.println(N + " x " + i + " = " + num);
        }

    }
}