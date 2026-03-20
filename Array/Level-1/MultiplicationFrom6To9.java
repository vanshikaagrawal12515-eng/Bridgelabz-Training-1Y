import java.util.Scanner;

public class MultiplicationFrom6To9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // a. Take integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define array to store results (6,7,8,9 → 4 values)
        int[] multiplicationResult = new int[4];

        // b. Find multiplication from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // c. Display the results
        System.out.println("\nMultiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}