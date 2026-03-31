import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if character is vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);   // Convert to lowercase
        }

        // Check if it is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants
    // Returns array: [vowelCount, consonantCount]
    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] counts = countVowelsAndConsonants(input);

        System.out.println("\nTotal Vowels: " + counts[0]);
        System.out.println("Total Consonants: " + counts[1]);

        sc.close();
    }
}
