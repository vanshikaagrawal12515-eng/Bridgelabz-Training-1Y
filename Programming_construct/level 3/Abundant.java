import java.util.Scanner;
class Abundant{
    public static void main(String are[]){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(),i,f=1,c=0;
        for(i=1;i<=a;i++){
            if(a%i==0 && a!=i){
            f=i;
            c+=i;
            }
        }
        if(a<c){
            System.out.println("its an Abundant no.");
        }
        else{
            System.out.println("its not an Abundant no.");
        }
    }
}