import java.util.Scanner;
class average 
{
	public static void main (String args[])
	{
	 Scanner input =new Scanner (System.in);
	 System.out.println("enter your maths marks ");
	 int a=input.nextInt();
	 System.out.println("enter your pysics marks");
	 int b= input.nextInt();
	 System.out.println("enter your chemistery marks ");
	 int c =input.nextInt();
	 int average= (a+b+c)/3;
	 System.out.println("average of marks :-"+average);
	}
}