import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        // Step b: Get integer input and store it in number variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define sum variable and initialize it to zero
        int sum = 0;

        // Define originalNumber variable and assign it to input number
        int originalNumber = number;

        // Step c: Use while loop till originalNumber is not equal to zero
        while (originalNumber != 0) {

            // Step d: Find each digit using modulus operation (number % 10)
            int digit = originalNumber % 10;

            // Find the cube of the digit and add it to sum
            sum = sum + (digit * digit * digit);

            // Step e: Remove the last digit using division operation (number / 10)
            originalNumber = originalNumber / 10;
        }

        // Step f: Finally check if the number and the sum are the same
        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }
}