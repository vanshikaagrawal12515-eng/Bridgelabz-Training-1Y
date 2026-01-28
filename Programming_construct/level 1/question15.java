import java.util.Scanner;
class question_15
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number (n)");
		int num = input.nextInt();
		int total = 1;
		for(int i=1  ;i <= num ; i++)
		{
			total = total*i;
		}
		System.out.println("factorial at the end is :- "+total);
	}
}