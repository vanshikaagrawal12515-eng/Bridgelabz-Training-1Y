import java.util.Scanner;
class Sum_of_no{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the the Nth value and find it's sum upto that");
		int n = input.nextInt();
		int sum = (n*(n+1))/2;
		System.out.println("your answer :- "+sum);
	}
}