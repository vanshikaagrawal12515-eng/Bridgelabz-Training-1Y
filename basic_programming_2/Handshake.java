import java.util.Scanner;
class Handshake
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	 System.out.println("enter number of students ");
	 int numberofstudents  = input.nextInt();
	 int handshake  =(numberofstudents*(numberofstudents -1))/2;
	 System.out.println("maximum number of handshake"+handshake);
	}
}
