import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Get input and validate
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Number must be > 0 and < 100.");
            sc.close();
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");

        // Step b: For loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Step c: Check if i is a multiple of number
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}