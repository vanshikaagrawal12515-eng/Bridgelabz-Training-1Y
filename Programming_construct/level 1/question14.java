import java.util.Scanner;
class question_14
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number (n)");
		int num = input.nextInt();
		int total = 1;
		int i = 1;
		while(i <= num)
		{
			total = total*i;
			i++;
		}
		System.out.println("factorial at the end is :- "+total);
	}
}