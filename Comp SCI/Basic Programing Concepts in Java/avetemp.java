//Average Temperature
// Ryan KS
// September 14 2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Day 1: ");
        Double D1 = Double.parseDouble(scanner.next());
        System.out.println("Day 2: ");
        Double D2 = Double.parseDouble(scanner.next());
        System.out.println("Day 3: ");
        Double D3 = Double.parseDouble(scanner.next());
        System.out.println("Day 4: ");
        Double D4 = Double.parseDouble(scanner.next());
        System.out.println("Day 5: ");
        Double D5 = Double.parseDouble(scanner.next());
        System.out.println("Day 6: ");
        Double D6 = Double.parseDouble(scanner.next());
        System.out.println("Day 7: ");
        Double D7 = Double.parseDouble(scanner.next());
        double Total = (D1 + D2 + D3 + D4 + D5 + D6 + D7) /7;
        System.out.println("Average Temperature for the week: " + Total);
    }
}
