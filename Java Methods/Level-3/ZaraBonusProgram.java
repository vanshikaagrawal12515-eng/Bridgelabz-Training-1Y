public class ZaraBonusProgram {

    public static int[][] generateData(int n) {
        int[][] data = new int[n][2]; // [salary, years]

        for (int i = 0; i < n; i++) {
            int salary = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            int years = (int)(Math.random() * 10) + 1; // 1–10 years

            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        int n = data.length;
        double[][] result = new double[n][2]; 

        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02; 
            }

            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    public static void displayReport(int[][] data, double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = result[i][0];
            double newSalary = result[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println((i + 1) + "\t" + oldSalary + "\t\t" + years + "\t"
                    + (int)bonus + "\t" + (int)newSalary);
        }

        System.out.println("\n----- TOTALS -----");
        System.out.println("Total Old Salary: " + (int)totalOldSalary);
        System.out.println("Total New Salary: " + (int)totalNewSalary);
        System.out.println("Total Bonus Paid: " + (int)totalBonus);
    }

    public static void main(String[] args) {
        int n = 10;

        int[][] employeeData = generateData(n);
        double[][] result = calculateBonusAndNewSalary(employeeData);
        displayReport(employeeData, result);
    }
}