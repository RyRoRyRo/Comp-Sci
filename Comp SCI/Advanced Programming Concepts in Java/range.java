//A2 Max/Min Array
//October 30 2023
//Ryan KS
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        System.out.println("Please enter 10 Numbers: ");
        for (int i = 0; i < 10; i++) {
            array.add(scanner.nextInt());
        }
        int min = Collections.min(array);
        int max = Collections.max(array);
        int range = max - min;
        System.out.println("Min: " + min + " Max: " + max + " Range: " + range);
    }
}