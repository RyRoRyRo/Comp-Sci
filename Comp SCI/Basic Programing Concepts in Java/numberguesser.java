//Activity 8 Number Guesser
//Oct 6 2023
//Ryan KS
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Picking a random number between 1 and 30...");
        // Generate random number in the range 1-30
        int randomNumber = 1 + (int)(Math.random() * (30 - 1));
        int guessCount = 0;
        boolean guessedCorrectly = false;
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            Scanner scanner = new Scanner(System.in);
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("You guessed right! It took you " + guessCount + " wrong guesses.");
                guessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess was too low. Try again.");
                // We could add the line below, but it's unnecessary
                // since guessedCorrectly is already false
                // guessedCorrectly = false;
                guessCount++;
            } else {
                // This is the case where (userGuess > randomNumber)
                System.out.println("Your guess was too high. Try again.");
                guessCount++;
            }
        }
    }
}
