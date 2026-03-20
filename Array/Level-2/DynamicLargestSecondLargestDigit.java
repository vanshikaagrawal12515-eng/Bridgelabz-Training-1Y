import java.util.Scanner;

public class DynamicLargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        // Extract digits and dynamically increase array size
        while (number != 0) {

            // a & b. If array is full, increase size by 10
            if (index == maxDigit) {
                maxDigit += 10;

                int[] temp = new int[maxDigit];

                // Copy old elements into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // Assign new array back to digits
            }

            digits[index] = number % 10; // Store last digit
            number = number / 10;        // Remove last digit
            index++;
        }

        // Variables to store largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}