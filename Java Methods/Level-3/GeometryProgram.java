import java.util.Scanner;

public class GeometryProgram {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        return distance;
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // [m, b]

        double m = (y2 - y1) / (x2 - x1); 
        double b = y1 - (m * x1);         

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);

        double[] line = calculateLineEquation(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance: " + distance);
        System.out.println("Slope (m): " + line[0]);
        System.out.println("Y-Intercept (b): " + line[1]);

        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);

        sc.close();
    }
}