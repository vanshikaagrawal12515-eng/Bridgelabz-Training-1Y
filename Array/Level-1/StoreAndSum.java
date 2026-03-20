import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // a. Create array of 10 elements (double)
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // c. Break if 0 or negative number entered
            if (input <= 0) {
                break;
            }

            // d. Break if array size reaches 10
            if (index == 10) {
                System.out.println("Array limit reached (10 numbers).");
                break;
            }

            // e. Store number in array and increment index
            numbers[index] = input;
            index++;
        }

        // f. Loop to calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all stored numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // g. Display total
        System.out.println("\nTotal sum = " + total);

        scanner.close();
    }
}