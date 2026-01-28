import java.util.Scanner;
class question_12{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number (n)");
		int n = input.nextInt();
		if(n > 0){
			int total_1 = 0;
			for(int i = 1; i <= n; i++){
				total_1 = total_1 + i;
			}
			int total_2 = (n*(n+1))/2;
			System.out.println("sum by for loop :- "+total_1);
			System.out.println("sum by formula :- "+total_2);
			if(total_1 == total_2){
				System.out.println("both results are same");
			}else{
				System.out.println("something went wrong");
			}
		}else{
			System.out.println("invalid input, corret it next time");
		}
	}
}