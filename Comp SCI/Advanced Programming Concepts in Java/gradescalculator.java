//A3 Grades
//November 1 2023
//Ryan KS
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("Enter Your Grades Type 'quit': ");
        while (running) {
            String input = scanner.nextLine();
            if (input.equals("quit")){
                running = false;
            }
            else {
                try {
                    int inputs = Integer.parseInt(input);
                    values.add(inputs);
                } catch (NumberFormatException e) {
                    System.out.println("Error! Invalid Input");
                }

            }
        }
        int nines = 0;
        int fives = 0;
        int average = 0;
        int min = 0;
        int max = 0;
        for (int grade : values) {
            average += grade;
            if (grade >= 90) {
                nines++;
            }
            if (grade < 50) {
                fives++;
            }
        }
        average /= values.size();
        System.out.println("Highest Grade: " + Collections.max(values));
        System.out.println("Lowest Grade: " + Collections.min(values));
        System.out.println("Average: " + average);
        System.out.println("Number of grades higher than 90: " + nines);
        System.out.println("Number of grades lower than 50: " + fives);


    }
}


