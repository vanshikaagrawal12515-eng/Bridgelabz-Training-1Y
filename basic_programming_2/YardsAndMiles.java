import java.util.Scanner;
class YardsAndMiles
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter distance ");
        double feet = sc.nextDouble();
		double yards =feet/3;
		double miles=yards/1760;
		
        System.out.println("Yards " + yards);
        System.out.println("Miles " + miles);
    }
}
