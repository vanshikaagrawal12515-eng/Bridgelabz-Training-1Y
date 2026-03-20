import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            int i = 1;  // Initialize counter

            // While loop from 1 to number
            while (i <= number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                else {
                    System.out.println(i);
                }

                i++;  // Increment counter
            }
        }

        scanner.close();
    }
}