import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {   // infinite loop
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num <= 0) {   // check for 0 or negative
                break;        // exit the loop
            }

            sum += num;       // add to sum
        }

        System.out.println("Sum of entered positive numbers: " + sum);
        sc.close();
    }
}