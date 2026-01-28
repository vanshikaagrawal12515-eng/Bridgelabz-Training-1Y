import java.util.Scanner;
class by_5
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number");
		int a = input.nextInt();
		if(a%5 == 0)
		{
			System.out.println("yes it is divisible by 5 ");
		}else
		{
			System.out.println("not divisible by 5");
		}
	}
}
			
			