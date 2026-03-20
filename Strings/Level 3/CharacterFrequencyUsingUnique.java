import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // a. Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if character appeared before
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array of exact size
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // b. Method to find frequency using unique characters
    public static String[][] findFrequency(String text) {

        // i. Frequency array for 256 ASCII characters
        int[] frequency = new int[256];

        // ii. Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // iii. Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // iv. Create 2D String array
        String[][] result = new String[uniqueChars.length][2];

        // v. Store characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // c. Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }

        scanner.close();
    }
}
