import java.util.Scanner;

class Powerof13{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = s.nextInt();
        System.out.println("Enter the power:-");
        int p = s.nextInt();
        int result = 1;
        for(int i = 1; i <= p; i++) { 
            result = result * n;
        }
        System.out.println(result);
    }
}
