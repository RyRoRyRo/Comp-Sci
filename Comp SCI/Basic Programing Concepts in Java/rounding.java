//ryan KS
//Rounding
//september 20

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Double InputA = Double.parseDouble(scan.next());
        System.out.println("Enter Second Number: ");
        Double InputB = Double.parseDouble(scan.next());
// getting Numbers

//output
        Double Total = (InputA +InputB) * 100;
        Total = (double) Math.round(Total);
        Total = Total / 100;
        System.out.println("Total = " + Total);
    }
}