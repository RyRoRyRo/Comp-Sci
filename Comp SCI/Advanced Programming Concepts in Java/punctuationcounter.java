//Punctuation Counter
//Nov 10 2023
//Ryan KS
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int Count = 0;
        Set<String> Punctuation = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '.' || sentence.charAt(i) == ',' || sentence.charAt(i) == '?' || sentence.charAt(i) == '!' || sentence.charAt(i) == ';' || sentence.charAt(i) == ':' || sentence.charAt(i) == '-') {
                Punctuation.add(sentence.substring(i, i + 1));
                Count++;

            }
        }
        System.out.println("The sentence '" + sentence + "' has " +Count + " unique cases of punctuation. They are: " + Punctuation);
    }
}