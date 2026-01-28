import java.util.Scanner;
class PensDistribution
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	 System.out.println("enter total pens");
	 int pens= input.nextInt();
	 System.out.println("enter students");
	 int students =input.nextInt();
	 int q =pens/students;
	 int r=pens%students;
	 System.out.println("each students gets:-"+q);
	 System.out.println("remaining pens :-" +r);
	}
}