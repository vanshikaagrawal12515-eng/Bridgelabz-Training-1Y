import java.util.Scanner;

public class CharacterFrequency {

    // a. Method to find frequency and return 2D array
    public static Object[][] findFrequency(String text) {

        // i. Frequency array for 256 ASCII characters
        int[] frequency = new int[256];

        // ii. Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // iii. Create 2D array to store character and frequency
        Object[][] result = new Object[uniqueCount][2];

        // iv. Store characters and their frequencies
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = (char) i;      // Character
                result[index][1] = frequency[i];  // Frequency
                index++;
            }
        }

        return result;
    }

    // b. Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Object[][] result = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }

        scanner.close();
    }
}
