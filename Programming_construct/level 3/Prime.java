import java.util.Scanner;
class Prime{
    public static void main(String are[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Prime no.:-");
        int a=s.nextInt(),i,f=0;
        for(i=1;i<=a;i++){
            if(a%i==0)
            f++;
        }
        if(f<=2){
        System.out.println("Your number is prime no. ");
        }
        else{
        System.out.println("Your number is prime not a no. ");
        }
    }
}