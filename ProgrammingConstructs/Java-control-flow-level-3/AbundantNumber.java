import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        // b. Get an integer input for the number variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // c. Create an integer variable sum with initial value 0
        int sum = 0;

        // d. Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {

            // e. Check if number is divisible by i
            if (number % i == 0) {

                // f. If true, add i to sum
                sum += i;
            }
        }

        // g. Check if sum is greater than number
        if (sum > number) {

            // h. Print result
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        sc.close();
    }
}