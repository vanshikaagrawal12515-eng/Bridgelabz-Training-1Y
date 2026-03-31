import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Get input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power must be a non-negative integer!");
            sc.close();
            return;
        }

        // Step b: Initialize result
        int result = 1;

        // Step d: Initialize counter
        int counter = 0;

        // Step c: Use while loop to calculate power
        while (counter < power) {
            result *= number;
            counter++;
        }

        // Step d: Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}