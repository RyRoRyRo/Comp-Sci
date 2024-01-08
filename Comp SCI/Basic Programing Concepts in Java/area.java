//Perimeter/Area
// Ryan KS
// September 14 2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Side Length A");
        Double A = Double.parseDouble(scanner.next());
        System.out.println("Side Length B");
        Double B = Double.parseDouble(scanner.next());

        double Perm = 2 * (A + B);
        double Area = A * B;
        System.out.println("Perimeter: " + Perm + " Area: " + Area);
    }
}
