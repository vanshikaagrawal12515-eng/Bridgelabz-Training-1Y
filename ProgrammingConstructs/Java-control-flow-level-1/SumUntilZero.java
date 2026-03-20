import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double number;

        // Prompt the user for the first input
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total += number;  // Add the number to total
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

        System.out.println("The total sum is: " + total);

        sc.close();
    }
}