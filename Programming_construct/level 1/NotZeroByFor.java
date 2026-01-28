import java.util.Scanner;
class not_zero_by_for
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number");
		double total = 0.0;
		double num = input.nextDouble();
		while(true)
		{
			if( num <= 0 )
			{
				break;
			}
			total = total + num;
			num = input.nextDouble();
		}
		System.out.println("total = " +total);
	}
}		