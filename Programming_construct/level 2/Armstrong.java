import java.util.Scanner;
class Armstrong{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int c=0,d=1,e,f=0,g,h=1;
        int b=a;
        e=a;
        g=a;
        while(a>0){
            c++;
            a/=10;
        }
        System.out.println("Digit count= "+c);
    }
}