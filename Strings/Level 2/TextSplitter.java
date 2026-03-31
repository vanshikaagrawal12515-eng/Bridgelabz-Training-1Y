import java.util.Scanner;

public class TextSplitter {

    // Method to find length without using length()
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

        // Step 1: Count words (assuming words separated by single spaces)
        int wordCount = 1;  // At least one word if string not empty
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Step 3: Extract words using indexes
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

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // User-defined split
        String[] customResult = customSplit(input);

        // Built-in split()
        String[] builtInResult = input.split(" ");

        // Compare results
        boolean isSame = compareArrays(customResult, builtInResult);

        // Display results
        System.out.println("\nWords using custom split():");
        for (String word : customResult) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split():");
        for (String word : builtInResult) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + isSame);

        sc.close();
    }
}
