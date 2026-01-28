

import java.util.Scanner;
class Intop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("enter value a");
        int a = sc.nextInt();
		        System.out.println("enter value b ");
				
        int b = sc.nextInt();
		        System.out.println("enter value c");
				
        int c = sc.nextInt();
        System.out.println(a + b * c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
    }
}
