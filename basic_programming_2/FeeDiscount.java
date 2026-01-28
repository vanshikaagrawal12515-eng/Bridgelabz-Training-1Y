import java.util.Scanner;
class FeeDiscount
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	 System.out.println("enter fee ");
	 int fee= input.nextInt();
	 System.out.println("enter discount percent");
	 int  d =input.nextInt();
	 double  discount =fee*d/100;
	 double finalfee=fee-discount;
	 System.out.println("original fee:-"+fee);
	 System.out.println("discount :-" +discount);
	 System.out.println("final fee:-"+finalfee);
	}
}