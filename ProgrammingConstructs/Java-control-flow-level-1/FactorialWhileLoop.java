import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if the number is positive
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}