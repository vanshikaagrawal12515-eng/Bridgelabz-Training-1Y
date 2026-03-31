import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        // Check if the number is a natural number
        if (number > 0 && number == (int) number) {
            int n = (int) number;
            int sum = n * (n + 1) / 2;

            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        sc.close();
    }
}