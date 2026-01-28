import java.util.Scanner;
class harry 
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	 System.out.println("enter birth year");
	 int a= input.nextInt();
	 System.out.println("enter current year");
	 int b =input.nextInt();
	 int subtract =b-a;
	 System.out.println("subtraction of two number :-" +subtract);
	}
}