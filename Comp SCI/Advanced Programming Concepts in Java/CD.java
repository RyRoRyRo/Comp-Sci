//A3 CD Collection
//November 1 2023
//Ryan KS
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        System.out.println("Enter CDs to your collection. Type 'quit': ");
        while (running) {
            String input = scanner.nextLine();
            if (input.equals("quit")){
                running = false;
            }
            else {
                values.add(input);
            }
        }
        System.out.println("Your CD Collection: ");
        for (String s : values) {
            System.out.println(s);
        }
    }
}
