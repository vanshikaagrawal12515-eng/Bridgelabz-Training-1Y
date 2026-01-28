import java.util.Scanner;
class Even{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        while(a>0){
        if (a%2==0){
            System.out.println("Even= "+a);
        }
        else{
            System.out.println("Odd= "+a);
        }
        a-=1;
        }
    }
}