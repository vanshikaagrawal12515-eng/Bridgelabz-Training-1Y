
import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert lowercase characters to uppercase using ASCII values
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase by subtracting 32
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take user input
        System.out.println("Enter the text:");
        String input = sc.nextLine();

        // Step b: Convert using custom method
        String customUpper = convertToUpperCase(input);

        // Step d: Convert using built-in method
        String builtInUpper = input.toUpperCase();

        // Step c: Compare both results
        boolean isSame = compareStrings(customUpper, builtInUpper);

        // Display results
        System.out.println("Custom Uppercase Conversion: " + customUpper);
        System.out.println("Built-in Uppercase Conversion: " + builtInUpper);
        System.out.println("Are both conversions identical? " + isSame);

        sc.close();
    }
}
