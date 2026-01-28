import java.util.Scanner;
class square
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	 System.out.println("enter perimeter");
	 double perimeter = input.nextDouble();
	 double side =perimeter/4;
	 System.out.println("side of square :-" +side+"whose perimeter is"+perimeter);
	}
}

