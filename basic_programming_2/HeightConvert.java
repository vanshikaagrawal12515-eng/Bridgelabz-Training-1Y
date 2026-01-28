import java.util.Scanner;
class HeightConvert
{
	public static void main (String args[])
	{
	Scanner input =new Scanner(System.in);
	 System.out.println("enter height in cm");
	 double cm = input.nextDouble();
	 double inches=cm/2.54;
	 int feet=(int)(inches/12);
	 double inch  =inches%12;
	 System.out.println("feet" +feet);
	 System.out.println("inches:-"+inch);
	}
}