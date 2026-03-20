import java.util.Scanner;

public class AthleteRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // perimeter of triangle
        double distance = 5000; // 5 km = 5000 meters
        double rounds = distance / perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for triangle sides
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calling method
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");

        sc.close();
    }
}