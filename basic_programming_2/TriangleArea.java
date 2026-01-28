	 import java.util.Scanner;
class TriangleArea
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	 System.out.println("enter base");
	 double base= input.nextDouble();
	 System.out.println("enter height");
	 double height =input.nextDouble();
	 double  areacm=0.5*base*height;
	 double areainch=areacm/6.4516;
	 System.out.println("Area of aquare in cm:-"+areacm);
	 System.out.println("Area of square in inches:-"+areainch);
	}
}