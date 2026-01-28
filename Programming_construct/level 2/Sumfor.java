import java.util.Scanner;
class Sumfor{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b;
        for(int i=6; i<=9; i++){
            for(int j=1; j<=10; j++){
                b=i*j;
                System.out.println(+b);
            }
        }
    }
}