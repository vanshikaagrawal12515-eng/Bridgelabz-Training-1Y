import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        // b. Get an integer input for the number variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int originalNumber = number; // Store original number

        // c. Create an integer variable sum with initial value 0
        int sum = 0;

        // Handle negative numbers
        number = Math.abs(number);

        // d. Create a while loop to access each digit of the number
        while (number != 0) {
            // e. Inside the loop, add each digit of the number to sum
            sum += number % 10;
            number = number / 10;
        }

        // f. Check if the number is perfectly divisible by the sum
        if (sum != 0 && originalNumber % sum == 0) {
            // g. Print result
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }

        sc.close();
    }
}