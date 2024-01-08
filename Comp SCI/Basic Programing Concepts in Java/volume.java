//Volume
// Ryan KS
// September 14 2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length: ");
        Double A = Double.parseDouble(scanner.next());
        System.out.println("Width: ");
        Double B = Double.parseDouble(scanner.next());
        System.out.println("Height: ");
        Double C = Double.parseDouble(scanner.next());

        double V = A * B * C;
        System.out.println("Volume: " + V);
    }
}
