import java.util.Scanner;
class Bonus{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Salary:-");
        int a=s.nextInt();
        System.out.println("Enter the Year of Service:-");
        int b= s.nextInt();
        double c=(b*a)/100;
        System.out.println("Bonus= "+c);
    }
}