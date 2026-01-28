import java.util.Scanner;
class KMToMiles
{
	public static void main (String args[])
	{
		double km,miles;
	Scanner input =new Scanner(System.in);
	System.out.println("enter distance in km");
	km = input.nextDouble();
	miles =km/1.6;
	 System.out.println("the total miles is:-" + miles);
	}
}