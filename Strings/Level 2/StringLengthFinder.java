import java.util.Scanner;

public class StringLengthFinder {

    // User-defined method to calculate string length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {   // Infinite loop
                str.charAt(count);  // Access each character
                count++;            // Increment counter
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();   // Taking user input using next()

        // Calling user-defined method
        int customLength = findLength(input);

        // Calling built-in length() method
        int builtInLength = input.length();

        System.out.println("Length calculated without using length(): " + customLength);
        System.out.println("Length calculated using built-in length(): " + builtInLength);

        sc.close();
    }
}
