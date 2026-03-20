import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double number3 = sc.nextDouble();

        // Check which number is the largest
        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));

        sc.close();
    }
}