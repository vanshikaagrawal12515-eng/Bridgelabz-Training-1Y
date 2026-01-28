import java.util.*;
class Leapyear{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the leap year:-");
        int a=s.nextInt();
        if((a%4==0 && a%10!=0)||(a%400==0)){
                System.out.println("Its a leap year");
            }
        else{
            System.out.println("Its not a leap year");
        }
    }
}