import java.util.Scanner;

class Power6{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = s.nextInt();
        System.out.println("Enter the power:-");
        int p = s.nextInt();
        int result = 1;
        while(p>0) { 
            result = result * n;
            p-=1;
        }
        System.out.println("the result is= "result);
    }
}
