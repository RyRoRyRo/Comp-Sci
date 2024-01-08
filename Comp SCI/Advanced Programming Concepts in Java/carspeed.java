import java.util.Scanner;
public class Main {
    public static Double Time;
    public static Double Distance;
    public static Double Speed;
    public static void main(String[] args)
    {
        Input();
        Input();
        if (Speed == null){
            Speed = Distance/Time;
        }
        else if (Distance == null){
            Distance = Speed * Time;
        }
        else if (Time == null){
            Time = Distance/Speed;
        }
        System.out.println("\nDistance = " + Distance + " Km \nSpeed = " + Speed + " Km/h \nTime = " + Time + " Hours");
    }
    public static void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter what variable you are defining. \nTime (T), Distance (D), or Speed (S): ");
        String Variable = scanner.nextLine();
        if (Variable.equalsIgnoreCase("T")) {
            System.out.print("Enter its value (Time = Hours): ");
            Time = Double.parseDouble(scanner.nextLine());
            System.out.println("Time = " + Time + " hours");
        }
        else if (Variable.equalsIgnoreCase("D")) {
            System.out.print("Enter its value (Distance = Km): ");
            Distance = Double.parseDouble(scanner.nextLine());
            System.out.println("Distance = " + Distance + " Km");
        }
        else if (Variable.equalsIgnoreCase("S")) {
            System.out.print("Enter its value (Speed = Km/h): ");
            Speed = Double.parseDouble(scanner.nextLine());
            System.out.println("Speed = " + Speed + " Km/h");
        }
        else {
            System.out.println("Error: Invalid input");
        }
    }
}
