import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Get input and validate
        System.out.print("Enter a positive integer for the base: ");
        int number = sc.nextInt();

        System.out.print("Enter a positive integer for the power: ");
        int power = sc.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Both number and power must be positive integers!");
            sc.close();
            return;
        }

        // Step b: Initialize result
        int result = 1;

        // Step c: Run a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // multiply result by number
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}