import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        // Step a: Get an integer input for the number variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step b: Create an integer variable count with value 0
        int count = 0;

        // (Optional) Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Step c: Use a loop to iterate until number is not equal to 0
        while (number != 0) {

            // Step d: Remove the last digit from number in each iteration
            number = number / 10;

            // Step e: Increase count by 1 in each iteration
            count++;
        }

        // Special case: if the number is 0, it has 1 digit
        if (count == 0) {
            count = 1;
        }

        // Step f: Finally display the count
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}