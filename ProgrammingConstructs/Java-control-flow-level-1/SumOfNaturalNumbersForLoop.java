import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the number is natural (greater than 0)
        if (n <= 0) {
            System.out.println("The entered number is not a natural number.");
        } else {

            // Compute sum using for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare results
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("There is a mismatch in the computations.");
            }
        }

        sc.close();
    }
}