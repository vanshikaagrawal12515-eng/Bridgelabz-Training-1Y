import java.util.Scanner;

public class LeapYear {

    public static String isLeapYear(int year) {
       
        if (year < 1582) {
            return "Invalid year (must be >= 1582)";
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return "Year is a Leap Year";
        } else {
            return "Year is not a Leap Year";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));

        sc.close();
    }
}