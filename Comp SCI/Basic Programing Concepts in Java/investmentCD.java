//Activity 7 CD Calculator
//Oct 6 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter investment: ");
        float investment = scan.nextFloat();
        System.out.println("Enter interest rate: ");
        float interest = scan.nextFloat();
        System.out.println("Enter target value: ");
        float endValue = scan.nextFloat();
        int years = 0;
        double total = investment;
        while (total < endValue) {
            total += total * (interest / 100);
            years++;
        }
        System.out.println("It will take " + years + " years to reach " + endValue);
    }
}
