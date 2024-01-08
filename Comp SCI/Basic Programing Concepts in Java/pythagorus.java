//ryan KS
//Pythagorus triangle
//september 20

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Side A: ");
        Double SideA = Double.parseDouble(scan.next());
        System.out.println("Enter Side B: ");
        Double SideB = Double.parseDouble(scan.next());
// getting Side Lengths

//output
        Double SideC = (SideA * SideA) + (SideB * SideB);
        SideC = Math.sqrt(SideC);
        System.out.println("Hypotonus = " + SideC);
    }
}