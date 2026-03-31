import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        // Check if the number is a natural number (greater than 0)
        if (num <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            long factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}