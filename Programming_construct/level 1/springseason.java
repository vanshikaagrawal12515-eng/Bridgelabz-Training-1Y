import java.util.Scanner;
class spring_season{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter month in integer form");
		int month = input.nextInt();
		System.out.println("enter date");
		int date = input.nextInt();
		if(month == 3){
			if(date >= 20 && date <=31){
				System.out.println("its a spring season");
			}else if(date <= 0){
				System.out.println("invalid date");
			}else{
				System.out.println("not a spring season");
			}
		}else if(month == 4){
			if(date > 0 && date <= 30){
				System.out.println("its a spring season");
			}else if(date <= 0){
				System.out.println("invalid date");
			}else{
				System.out.println("not a spring season");
			}
		}else if(month == 5){
			if(date > 0 && date <= 31){
				System.out.println("its a spring season");
			}else if(date <= 0){
				System.out.println("invalid date");
			}else{
				System.out.println("not a spring season");
			}
		}else if(month == 6){
			if(date > 0 && date <= 20){
				System.out.println("its a spring season");
			}else if(date <= 0){
				System.out.println("invalid date");
			}else{
				System.out.println("not a spring season");
			}
		}
		else if(month > 12 || month <=0){
			System.out.println("invalid month");
		}else{
			System.out.println("not a spring season");
		}
	}
}