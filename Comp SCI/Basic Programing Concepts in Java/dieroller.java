//die roller
// ryan KS
// September 28 2023
public class Main {
    public static void main(String[] args) {
        int D1 = (int)(Math.random() * 6);
        int D2 = (int)(Math.random() * 6);
        int Total = D1 + D2;
 //rolls the dice and adds them together
        String A1 = NumberWord(D1);
        String A2 = NumberWord(D2);
        String T = NumberWord(Total);
        System.out.print("Die 1: " + A1 + "\nDie 2: " + A2 + "\nBoth Dice: " + T);
        // prints output after they hgave been converted to words
    }
    public static String NumberWord(int Value) {
        switch (Value) {
            //converts to words depending on the value
            case 1 -> {
                return "ONE";
            }
            case 2 -> {
                return "TWO";
            }
            case 3 -> {
                return "THREE";
            }
            case 4 -> {
                return "FOUR";
            }
            case 5 -> {
                return "FIVE";
            }
            case 6 -> {
                return "SIX";
            }
            case 7 -> {
                return "SEVEN";
            }
            case 8 -> {
                return "EIGHT";
            }
            case 9 -> {
                return "NINE";
            }
            case 10 -> {
                return "TEN";
            }
            case 11 -> {
                return "ELEVEN";
            }
            case 12 -> {
                return "TWELVE";
            }
        }
        return "Invalid";
    } //defualt error case
}
