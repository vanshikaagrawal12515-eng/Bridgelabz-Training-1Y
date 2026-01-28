import java.util.Scanner;
class not_zero{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number");
		double total = 0.0;
		double num = input.nextDouble();
		while( num!=0 ){
			total = total + num;
			num = input.nextDouble();
		}
		System.out.println("total = " +total);
	}
}		