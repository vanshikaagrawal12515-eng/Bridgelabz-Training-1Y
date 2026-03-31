import java.util.Scanner;

public class FactorProgram {

    public static int[] getFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
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
    public static double getSumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum of factors: " + getSum(factors));
        System.out.println("Product of factors: " + getProduct(factors));
        System.out.println("Sum of squares of factors: " + getSumOfSquares(factors));

        sc.close();
    }
}