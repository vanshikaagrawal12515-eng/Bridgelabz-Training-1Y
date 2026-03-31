import java.util.Scanner;

public class MultiplesBelow100While {
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

        // Step b: Initialize counter
        int counter = 100;

        // Step c: Use while loop to find multiples
        while (counter >= 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }

        sc.close();
    }
}