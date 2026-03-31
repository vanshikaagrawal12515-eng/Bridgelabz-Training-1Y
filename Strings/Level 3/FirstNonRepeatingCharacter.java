import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // b. Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {

        // i. Create frequency array for 256 ASCII characters
        int[] frequency = new int[256];

        // ii. Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // iii. Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character found
        return '\0';
    }

    // c. Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
