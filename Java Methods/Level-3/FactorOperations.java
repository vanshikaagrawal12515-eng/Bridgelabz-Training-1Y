import java.util.Scanner;

public class FactorOperations {

    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    public static int getSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public static long getProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static double getCubeProduct(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nGreatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSum(factors));
        System.out.println("Product of Factors: " + getProduct(factors));
        System.out.println("Product of Cubes of Factors: " + getCubeProduct(factors));

        sc.close();
    }
}