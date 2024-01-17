//January 10, 2023
//Summative 1: NumberGame
//Ryan KS
//Game where you memorise numbers in a sequence. Additional features included.
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static int highScore;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Difficulty:"); //Easy = 1, Normal = 2, Hard = 3, Impossible = 4
        System.out.println("1. Easy:");
        System.out.println("2. Normal:");
        System.out.println("3. Hard:");
        System.out.println("4. Impossible:");
        System.out.println("5. Instructions");

        int difficulty = scanner.nextInt();
        switch (difficulty) { //switch case for difficulty/instructions
            case 1:
                clearScreen();
                System.out.println("Starting Easy Game. Good Luck!");
                wait(1000);
                runRound(1, args);
                break;

            case 2:
                clearScreen();
                System.out.println("Starting Normal Game. Good Luck!");
                wait(1000);
                runRound(2, args);
                break;
            case 3:
                clearScreen();
                System.out.println("Starting Hard Game. Good Luck!");
                wait(1000);
                runRound(3, args);
                break;
            case 4:
                clearScreen();
                System.out.println("Starting Impossible Game. Good Luck! You'll need it.");
                wait(1000);
                runRound(4, args);
                break;
            case 5:
                System.out.println("Memorize the numbers that are displayed on screen. \nThen type them out in one line seperated by spaces. \nIf you get a number wrong you will lose a life. Rounds get faster each time.");
                wait(5000);
                System.out.println("-------------------------");
                main(args);
                break;

        }


    }

    public static void runRound(int gameDifficulty, String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Score = 0;
        int lives = 5 - gameDifficulty;
        for (int round = 1; lives > 0; round++) {
            int timer = 5000 / gameDifficulty - (round * 10); //speed up rounds based on difficulty and what round you are at
            System.out.println("Memorize! Lives: " + lives + " Score: " + Score); //print info
            int numbers[] = randomNumber(gameDifficulty, round); //print numbers
            for (int n : numbers) {
                System.out.print(n + ", ");
            }
            wait(timer);
            clearScreen();
            System.out.println("Enter the Numbers: ");
            String guess = scanner.nextLine();
            String[] answer = guess.split(" "); //split guess
            if (answer.length != numbers.length) { //if guess doesnt have enough numbers its automatically wrong.
                lives--;
                System.out.println("Wrong! ");
                wait(2000);
            }
            else {
                for (int i = 0; i < answer.length; i++) { 
                    if (Integer.parseInt(answer[i]) != numbers[i]) {
                        System.out.println("Wrong!! Answers:");
                        for (int n : numbers) { //print correct answers
                            System.out.print(n + ", ");
                        }
                        lives--; //decrese lives
                        wait(1500);
                        break;
                    } else {
                        System.out.println("Correct!");
                        wait(500);
                        Score++;
                        break; //rerun round and add score
                    }
                }
            }
            if (lives == 0) {
                System.out.println("\nGame Over! Score: " + Score);
                break; //game over at 0 lives
            }


        }
        if (Score > highScore) {
            System.out.println("New High Score!"); //update highscore
            highScore = Score;
        }
        System.out.println("Current High Score: " + highScore);
        System.out.println("Play again? (y/n)");
        String playagain = scanner.nextLine();
        switch (playagain.toLowerCase()) {
            case "y" -> {
                main(args); //restart program
            }
            case "n" -> {
                break; //end program
            }
        }

    }

    private static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println(); //prints 30 blank lines to clear screen
        }
    }

    private static void wait(int sec) {
        try {
            Thread.sleep(sec); //wait
        } catch (InterruptedException e) {
            e.printStackTrace(); //catch case
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
