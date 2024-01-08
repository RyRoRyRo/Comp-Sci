//Word Guessing Game
//Nov 10 2023
//Ryan KS
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter to guess: ");
        String letter = scanner.nextLine();
        letter = letter.toUpperCase();
        Set<String> guesses = new HashSet<String>();
        if (letter.length() != 1) {
            System.out.println("Please enter a single letter.");
            System.exit(0);
        }
        System.out.println("Enter a custom word length: ");
        int length = scanner.nextInt();
        System.out.println("------------------------------");

        System.out.println("Enter as many " + length + " letter words as you can that begin with " + letter + ".");

        boolean playing = true;
        while (playing) {
            System.out.println("------------------------------");
            System.out.println("Enter a " + length + " letter word that begins with " + letter + ", or type quit to quit: ");
            String guess = scanner.nextLine();
            guess = guess.toUpperCase();
            // ensure the word is 5 letters
            if (guess.length() != length && !guess.equalsIgnoreCase("quit")) {
                System.out.println("Please enter a " + length + " letter word.");
                continue;
            }

            else if (guess.equalsIgnoreCase("quit")) {
                playing = false;
                break;
            }
            if (!guess.startsWith(letter)) {
                System.out.println("Please enter a word that begins with " + letter + ".");
                continue;
            }
            guesses.add(guess);


        }
        System.out.print("You got " + guesses.size() + " word(s): ");
        for (String guess : guesses) {
            System.out.print(guess + " ");
        }
    }
}