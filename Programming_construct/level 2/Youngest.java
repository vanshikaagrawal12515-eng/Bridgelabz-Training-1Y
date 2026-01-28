import java.util.Scanner;
class Youngest{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Amar's age");
        int a=s.nextInt();
        System.out.println("Enter Akbar's age");
        int b=s.nextInt();
        System.out.println("Enter Anthony's age");
        int c=s.nextInt();
        if(a<b && a<c){
            System.out.println(a + " is Youngest");
        }
        else if(b<a && b<c){
            System.out.println(b + " is Youngest ");

        }
        else if(c<a && c<b){
            System.out.println(c + " is Youngest ");

        }
    }
}