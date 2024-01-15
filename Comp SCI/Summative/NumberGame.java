//January 10, 2023
//Summative 1: NumberGame
//Ryan KS
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static int difficulty; //Easy = 1, Normal = 2, Hard = 3, Impossible = 4
    public static int highScore;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Difficulty:");
        System.out.println("1. Easy:");
        System.out.println("2. Normal:");
        System.out.println("3. Hard:");
        System.out.println("4. Impossible:");

        int difficulty = scanner.nextInt();
        switch (difficulty) {
            case 1:
                clearScreen();
                System.out.println("Starting Easy Game. Good Luck!");
                wait(1000);
                runRound(1);
                break;

            case 2:
                clearScreen();
                System.out.println("Starting Normal Game. Good Luck!");
                wait(1000);
                runRound(2);
                break;
            case 3:
                clearScreen();
                System.out.println("Starting Hard Game. Good Luck!");
                wait(1000);
                runRound(3);
                break;
            case 4:
                clearScreen();
                System.out.println("Starting Impossible Game. Good Luck! You'll need it.");
                wait(1000);
                runRound(4);
                break;
        }


    }

    public static void runRound(int gameDifficulty) {
        Scanner scanner = new Scanner(System.in);
        int lives = 5 - gameDifficulty;
        for (int round = 1; lives > 0; round++) {
            int timer = 5000 / gameDifficulty - (round * 10);
            System.out.println("Memorize! Lives: " + lives);
            int numbers[] = randomNumber(gameDifficulty, round);
            for (int n : numbers) {
                System.out.print(n + ", ");
            }
            wait(timer);
            clearScreen();
            System.out.println("Enter the Numbers: ");
            int guess = scanner.nextInt();


        }
    }

    private static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    private static void wait(int sec) {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int[] randomNumber(int gameDifficulty, int round) {
        Random random = new Random();
        int[] sequence = new int[round];
        for (int i = 0; i < round; i++) {
            if (gameDifficulty < 3) {
                sequence[i] = (int)(Math.random() * 9 + 1); //single-digit numbers for easy or normal
            }
            if (gameDifficulty > 2) {
                sequence[i] = (int)(Math.random() * 99 + 1); //double-digit numbers for hard or impossible
            }
        }
        return sequence;
    }
}
