import java.util.*;
class Cal{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your number 1:-");
        int  a=s.nextInt();
        System.out.println("Enter your number 2:-");
        int b=s.nextInt(),c=0;
        s.nextLine();

        System.out.println("Enter operator (+ - * /):");
        
        String st =s.nextLine();
        switch(st){
            case "+":
                c=a+b;
                System.out.println("Sum of Your number is= "+c);
                break;
            case "-":
                c=a-b;
                System.out.println("Sum of Your number is= "+c);
                break;
            case "*":
                c=a*b;
                System.out.println("Sum of Your number is= "+ a*b);
                break;
            case "/":
                c=a/b;
                System.out.println("Sum of Your number is= "+ a/b);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}