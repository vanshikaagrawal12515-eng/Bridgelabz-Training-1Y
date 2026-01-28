import java.util.Scanner;
class divide {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	   System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
		
        System.out.println("Quotient " + (a/b));
        System.out.println("Remainder " + (a%b));
    }
}
