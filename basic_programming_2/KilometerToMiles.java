import java.util.Scanner;
class KilometerToMiles
{
	public static void main (String args [])
	{
	Scanner input =new Scanner(System.in);
	System.out.println("enter kilometer");
	int Kilometer=input.nextInt();
	double miles =Kilometer * 0.621371;
	System.out.println("miles:-"+miles);
	
	}
}