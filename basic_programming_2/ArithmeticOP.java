import java.util.Scanner;
class ArithmeticOP
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	 System.out.println("enter number 1");
	 float a= input.nextFloat();
	 System.out.println("enter number 2");
	 float b =input.nextFloat();
	 System.out.println("add:-"+(a+b));
	 System.out.println("sub"+(a-b));
	 System.out.println("div"+(a/b));
	 System.out.println("mul:-"+(a*b));
	}
}