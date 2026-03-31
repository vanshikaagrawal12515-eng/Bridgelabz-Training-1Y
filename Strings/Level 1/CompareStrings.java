import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        
        // If lengths are different, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt() method
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Compare using built-in equals() method
        boolean resultEquals = str1.equals(str2);

        // Display results
        System.out.println("Result using charAt(): " + resultCharAt);
        System.out.println("Result using equals(): " + resultEquals);

        // Check if both results are same
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give same result.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}