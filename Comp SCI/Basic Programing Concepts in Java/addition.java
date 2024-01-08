//addition game
// ryan KS
// September 28 2023
import java.util.Scanner;
public class Main {
    public static int A;
    public static int B;
    public static int Answer;
    public static int Points;
    public static void main(String[] args) {
        Input();
        Input();
        Input();
        Input();
        Input();
        // repeates inout method 4 times
        System.out.print("FINISHED!\nYou got (" +Points+"/5) Answers Correct!");
        // prints total correct guesses
    }
    public static void Input() {
        Scanner scanner = new Scanner(System.in);
        A = (int)(Math.random() * 20);
        B = (int)(Math.random() * 20);
        // random from 1-20
        System.out.print("What is " + A + " + " + B + "?\n");
        // input
        Answer = scanner.nextInt();
        int Sum = A + B;
        // sum
        if (Answer == Sum) {
            System.out.print("CORRECT!\n");
            Points = Points + 1;
        } //checking iff correct or incorrect
        else {
            System.out.print("INCORRECT!\n");
        }
    }
}
