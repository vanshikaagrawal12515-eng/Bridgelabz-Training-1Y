import java.util.Scanner;

public class UniqueCharacters {

    // a. Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index is out of bounds
        }
        return count;
    }

    // b. Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {

        int length = findLength(text);

        // i. Create array to store unique characters (max possible size = length)
        char[] tempArray = new char[length];
        int uniqueCount = 0;

        // ii. Nested loops to check uniqueness
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check with previous characters
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Store unique character
            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // iii. Create new array with exact unique size
        char[] uniqueArray = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = tempArray[i];
        }

        return uniqueArray;
    }

    // c. Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] result = findUniqueCharacters(input);

        System.out.println("Unique characters are:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
