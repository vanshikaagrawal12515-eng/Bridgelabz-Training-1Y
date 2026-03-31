import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }
        
        scanner.close();
    }
}