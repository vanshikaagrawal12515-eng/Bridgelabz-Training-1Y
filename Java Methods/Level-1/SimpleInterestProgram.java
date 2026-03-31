import java.util.Scanner;

public class SimpleInterestProgram {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Calling the method
        double si = calculateSimpleInterest(principal, rate, time);

        // Output
        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        sc.close();
    }
}