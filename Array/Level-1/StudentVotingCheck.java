import java.util.Scanner;

public class StudentVotingCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Define an array of 10 integer elements
        int[] ages = new int[10];

        // Take user input for the students' ages
        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");

        // b. Loop through the array using length property
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("The student with the age " + ages[i] + " has entered an invalid age.");
            } 
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } 
            else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}