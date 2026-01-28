import java.util.Scanner;
class counter_forloop
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number");
		int num = input.nextInt();
		for(int i=num;i>=1;i--){
			System.out.println(+i);
		}
		System.out.println("here is the final result");
	}
}
