import java.util.Scanner;
class Price
 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter unit price ");
        int unitprice = sc.nextInt();
		System.out.println("enter quantity");
        int quantity = sc.nextInt();
		int totalprice=unitprice *quantity;
		
        System.out.println("Total price is INR " + totalprice+"if quantity is "+quantity+"and unit price is "+unitprice);
    }
}
