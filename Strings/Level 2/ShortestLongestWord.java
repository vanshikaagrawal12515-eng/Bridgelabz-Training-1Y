import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {

        int length = findLength(text);

        // Count words (assuming single spaces)
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

        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] getWordAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    // Method to find shortest and longest word
    // Returns int array: [shortestIndex, longestIndex]
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = shortestLength;

        for (int i = 1; i < wordLengthArray.length; i++) {

            int currentLength = Integer.parseInt(wordLengthArray[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Step 1: Split words
        String[] words = customSplit(input);

        // Step 2: Create 2D array
        String[][] wordLengthArray = getWordAndLength(words);

        // Step 3: Find shortest and longest
        int[] resultIndexes = findShortestAndLongest(wordLengthArray);

        int shortestIndex = resultIndexes[0];
        int longestIndex = resultIndexes[1];

        // Display all words with lengths
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t\t" +
                    Integer.parseInt(wordLengthArray[i][1]));
        }

        // Display shortest and longest word
        System.out.println("\nShortest Word: " +
                wordLengthArray[shortestIndex][0] +
                " (Length: " +
                wordLengthArray[shortestIndex][1] + ")");

        System.out.println("Longest Word: " +
                wordLengthArray[longestIndex][0] +
                " (Length: " +
                wordLengthArray[longestIndex][1] + ")");

        sc.close();
    }
}
