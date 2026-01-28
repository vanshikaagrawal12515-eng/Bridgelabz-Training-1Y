import java.util.Scanner;
class Factor14{
    public static void main(String are[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(),i,f=1;
        for(i=1;i<=a;i++){
            if(a%i==0 && a!=i){
            f=i;
            System.out.println(+f);
            }
        }
    }
}