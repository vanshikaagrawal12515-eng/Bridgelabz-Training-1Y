import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            int counter = 1;  // Initialize counter

            // Run while loop
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;  // Increment counter
            }
        } else {
            System.out.println("Please enter a valid positive integer.");
        }

        scanner.close();
    }
}