import java.util.Scanner;
class vote{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter your age :-");
		int age = input.nextInt();
		if(age >= 18){
			System.out.println("the person can vote");
		}else{
			System.out.println("the person can't vote");
		}
	}
}