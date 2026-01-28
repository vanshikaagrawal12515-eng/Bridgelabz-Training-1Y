import java.util.Scanner;
class smallest{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = input.nextInt();
		System.out.println("enter 2nd number");
		int b = input.nextInt();
		System.out.println("enter 3rd number");
		int c = input.nextInt();
		if(a<b && a<c){
			System.out.println("1st is smallest");
		}else if(b<c && b<a){
			System.out.println("2nd is smallest");
		}else if(c<a && c<b){
			System.out.println("3rd is smallest");
		}
	}
}	