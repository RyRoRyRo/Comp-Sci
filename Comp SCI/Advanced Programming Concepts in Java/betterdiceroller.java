//A2 Cool Dice Roller
//October 30 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 1;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        System.out.println("How many dice do you want to roll?");
        amount = scanner.nextInt();
        int[] dice = new int[amount];
        System.out.println("Dice Values: ");
        for (int i = 0; i < amount; i++) {
            dice[i] = (int)(Math.random() * 6 + 1);
            switch (dice[i])
            {
                case 1 -> {
                    one++;
                }
                case 2 -> {
                    two++;
                }
                case 3 -> {
                    three++;
                }
                case 4 -> {
                    four++;
                }
                case 5 -> {
                    five++;
                }
                case 6 -> {
                    six++;
                }

            }
        }

        for (int i = 0; i < amount; i++) {
            System.out.print(dice[i] + ", ");
        }
        System.out.println("\nOnes: " + one + " Twos: " + two + " Threes: " + three + " Fours: " + four + " Fives: " + five + " Sixes: " + six);
    }
}

