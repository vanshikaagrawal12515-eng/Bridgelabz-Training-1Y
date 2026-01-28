import java.util.Scanner;
class counter{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number");
		int num = input.nextInt();
		while(num >= 1){
			System.out.println(+num);
			num--;
		}
		System.out.println("result is done");
	}
}
	