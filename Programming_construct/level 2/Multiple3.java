import java.util.Scanner;
class Multiple3{
    public static void main(String are[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(),i,f=1;
        for(i=a;i<=100;i++){
            if(i%a==0){
            f=i;
            System.out.println(+f);
            }
        }
    }
}