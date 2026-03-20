import java.util.Scanner;

public class HandshakeProgram {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calling the method
        int result = calculateHandshakes(numberOfStudents);

        // Displaying output
        System.out.println("The maximum number of possible handshakes is: " + result);

        sc.close();
    }
}