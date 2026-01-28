import java.util.Scanner;
class Multiple10{
    public static void main(String are[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(),i;
        int f=a,b=1;
        while(f<=100){
            if(f%a==0){
                b=f;
            System.out.println(+b);
            }
            f++;
        }
    }
}