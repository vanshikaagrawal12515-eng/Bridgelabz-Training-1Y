import java.util.Scanner;
class Armstrong_6{
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
        while(b!=0){
            d=b%10;
            for(int i=1; i<=c;i++){
            h*=d;
        }
            f+=h;
            h=1;
            b/=10;
        }
        if(g==f){
            System.out.println("Your number is Armstrong "+f);
        }
        else{
            System.out.println("Your number is not Armstrong "+f);
        }
    }
}