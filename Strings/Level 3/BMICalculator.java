import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status for one person
    public static String[] calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100.0;  // Convert cm to meters
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal Weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.format("%.2f", bmi),
                status
        };
    }

    // Method to process all 10 persons
    public static String[][] processBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] personData = calculateBMI(weight, height);

            result[i][0] = personData[0]; // Height
            result[i][1] = personData[1]; // Weight
            result[i][2] = personData[2]; // BMI
            result[i][3] = personData[3]; // Status
        }

        return result;
    }

    // Method to display data in tabular format
    public static void displayResult(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t\t" +
                    result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; // 10 rows, 2 columns

        // Taking input
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Process BMI
        String[][] result = processBMI(data);

        // Display results
        displayResult(result);

        sc.close();
    }
}
