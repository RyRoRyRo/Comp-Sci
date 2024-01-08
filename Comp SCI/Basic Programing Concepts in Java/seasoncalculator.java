import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperatures = new double[7];
        double totalTemperature = 0;
//loops thingy
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the temperature for Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            totalTemperature += temperatures[i];
        }
        double averageTemperature = totalTemperature / 7;
        String season;
        if (averageTemperature > 20) {
            season = "Summer";
        } else if (averageTemperature >= 0 && averageTemperature <= 20) {
            season = "Spring/Fall";
        } else {
            season = "Winter";
        }
        //output
        System.out.println("The average temperature is " + averageTemperature + "°C, so it's " + season + ".");
        scanner.close();
    }
}
