import java.util.*;
class BMI{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your weight in kg:-");
        double  a=s.nextDouble();
        System.out.println("Enter your height in meter:-");
        double b=s.nextDouble();
        double d=(a)/(b*b);
        if(d>=40.0){
            System.out.println("obese"+d);
        }
        else if(d<=39.9 && d>=25){
            System.out.println("overweight "+d);
        }
        else if(d<=24.9 && d>=18.5){
            System.out.println("Normal "+d);
        }
        else if(d<=18.4){
            System.out.println("underweight "+d);
        }
    }
}