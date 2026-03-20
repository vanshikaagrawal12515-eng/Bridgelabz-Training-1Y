public class SpringSeason {

    // Method to check if the date is in Spring
    public static boolean isSpring(int month, int day) {
        // March 20 to March 31
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // April and May
        else if (month == 4 || month == 5) {
            return true;
        }
        // June 1 to June 20
        else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Reading month and day from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Calling the method
        boolean spring = isSpring(month, day);

        // Output
        if (spring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}