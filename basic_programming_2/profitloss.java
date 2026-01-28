import java.util.Scanner;
class Profitloss
{
	public static void main (String args [])
	{
	Scanner input =new Scanner(System.in);
	System.out.println("enter cost price");
	int cp=input.nextInt();
	System.out.println("enter selling price");
	int sp=input.nextInt();
	int pl =sp -cp;
	double pp=(pl/cp)*100;
	System.out.println("profit:-"+pl);
	System.out.println("profit% :-"+pp);
	
	}
}