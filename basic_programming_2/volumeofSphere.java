 import java.util.Scanner;
class VolumeofSphere
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	System.out.println("enter radius");
	 double r= input.nextDouble();
	 double v=(4/3)*3.14*r*r*r;
	 
	 System.out.println("volume :-" +v);
	}
}