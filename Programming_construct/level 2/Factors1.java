import java.util.Scanner;
class Factors1{
    public static void main(String are[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(),f=1,b=1;
        while(f<a/2){
            if(a%f==0){
                b=f;
                System.out.println(+b);
            }
            f++;
        }
    }
}