import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking age input
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        // Taking height input
        System.out.print("Enter Amar's height: ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter Akbar's height: ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = scanner.nextDouble();

        // Finding youngest
        String youngest = "";
        int minAge = amarAge;

        youngest = "Amar";

        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }

        if (anthonyAge < minAge) {
            minAge = anthonyAge;
            youngest = "Anthony";
        }

        // Finding tallest
        String tallest = "";
        double maxHeight = amarHeight;

        tallest = "Amar";

        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }

        if (anthonyHeight > maxHeight) {
            maxHeight = anthonyHeight;
            tallest = "Anthony";
        }

        // Display results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}