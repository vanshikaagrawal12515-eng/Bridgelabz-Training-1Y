import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to number - 1
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a valid positive integer.");
        }

        scanner.close();
    }
}