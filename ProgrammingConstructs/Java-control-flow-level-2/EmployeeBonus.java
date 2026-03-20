import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Take salary input
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        
        // Take years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
        double bonus = 0;

        // Check if years of service is more than 5
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  // 5% bonus
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus applicable.");
        }

        scanner.close();
    }
}