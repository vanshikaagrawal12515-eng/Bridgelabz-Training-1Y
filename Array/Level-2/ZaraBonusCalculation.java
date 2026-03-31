import java.util.Scanner;

public class ZaraBonusCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // b. Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // c. Arrays for bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // d. Loop to take input
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = scanner.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = scanner.nextDouble();

            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter valid salary and years of service.");
                i--; // Decrement index to repeat input
                continue;
            }
        }

        // e. Loop to calculate bonus and totals
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;   // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02;   // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display individual results
        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        // f. Print totals
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}