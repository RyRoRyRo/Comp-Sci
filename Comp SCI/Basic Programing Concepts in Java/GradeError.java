//Error Check 2: Grade Average
//Oct 19 2023
//Ryan KS
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of classes: ");
        int classes = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < classes; i++) {
            System.out.println("Enter the grade for class " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            if (grade > 100 || grade < 0) {
                System.out.println("Invalid grade (Out of range. Please enter a grade in the range of 0-100)");
                i--;
                total -= grade;
            }
            total += grade;
        }
        System.out.println("Your average is " + (total / classes));
    }

}