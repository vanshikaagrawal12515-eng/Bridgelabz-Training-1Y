import java.util.Scanner;
class Harshad{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int c=0,b=1;
        int d=a;
        while(a>0){
            b=a%10;
            c+=b;
            a/=10;
        }
        if(d%c==0){
        System.out.println("Your nubmer is a Harshad number ");
        }
    }
}