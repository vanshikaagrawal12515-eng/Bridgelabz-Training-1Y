import java.util.Scanner;
class Doubleop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("enter value a");
        double a = sc.nextDouble();
		        System.out.println("enter value b");
        double b = sc.nextDouble();
		        System.out.println("enter value c");
        double c = sc.nextDouble();
        System.out.println(a + b * c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
    }
}
