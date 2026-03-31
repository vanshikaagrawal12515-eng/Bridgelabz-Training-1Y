import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number > 1) { // number must be at least 2 to have a factor other than itself
            int greatestFactor = 1; // Initialize greatest factor

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i; // Assign i as greatest factor
                    break; // Stop the loop once found
                }
            }

            System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Number must be greater than 1 to have a factor besides itself.");
        }

        scanner.close();
    }
}