import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // a. Create two double variables and one String variable
        double first, second;
        String op;

        Scanner sc = new Scanner(System.in);

        // b. Get input values for all variables
        System.out.print("Enter first number: ");
        first = sc.nextDouble();

        System.out.print("Enter second number: ");
        second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();

        // e. Perform operation using switch...case
        switch (op) {

            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            // g. Invalid operator case
            default:
                System.out.println("Invalid Operator.");
        }

        sc.close();
    }
}