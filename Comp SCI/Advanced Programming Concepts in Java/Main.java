//Rectangular Prism
//Nov 16 2023
//Ryan KS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle prism = new Rectangle(length, width, height);
        System.out.println("The volume of the rectangular prism is " + prism.volume());
        System.out.println("The surface area of the rectangular prism is " + prism.surfaceArea());
    }
}
