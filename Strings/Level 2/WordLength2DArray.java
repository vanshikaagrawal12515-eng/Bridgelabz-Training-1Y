import java.util.Scanner;

public class WordLength2DArray {

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {

        int length = findLength(text);

        // Count words (assuming single spaces between words)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] getWordAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  // Word
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);  // Convert int to String
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Split words
        String[] words = customSplit(input);

        // Create 2D array
        String[][] wordLengthArray = getWordAndLength(words);

        // Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");

        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]); // Convert back to int
            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}
