//Activity 8 Fib Seq
//Oct 6 2023
//Ryan KS
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Fibonacci Numbers do you want generated? ");
        int count = scanner.nextInt();
        int Fib1 = 1;
        int Fib2 = 0;
        int CFib = 0;
        for (int i = 0; i < count; i++) {
            CFib = Fib1 + Fib2;
            Fib1 = Fib2;
            Fib2 = CFib;
            System.out.print(CFib + ", ");
        }

    }
}