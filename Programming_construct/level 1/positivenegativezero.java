import java.util.Scanner;
class positive_negative_zero
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number");
		double num = input.nextDouble();
		if(num > 0)
		{
			System.out.println("the number is positive");
		}
		else if(num < 0)
		{
			System.out.println("the number is negative");
		}
		else if(num == 0)
		{
			System.out.println("the number is zero");
		}
		else
		{
			System.out.println("invaild input, pls enter any real number");
		}
	}
}
		