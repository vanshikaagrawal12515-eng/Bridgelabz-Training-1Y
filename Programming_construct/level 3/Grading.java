import java.util.*;
class Grading{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your maths no.:-");
        int a=s.nextInt();
        System.out.println("Enter your physics no.:-");
        int b=s.nextInt();
        System.out.println("Enter your chemistry no.:-");
        int c=s.nextInt(),d,e;
        d=(a+b+c)/3;
        if(d>=80){
            System.out.println("Grade A, Leven4, above agancy standerds=  "+d);
        }
        else if(d<80 && d>=70){
            System.out.println("Grade B, level 3, at agancy standerds=  "+d);
        }
        else if(d<70 && d>=60){
            System.out.println("Grade C, level 2, below but approaching agancy standerds=  "+d);
        }
        else if(d<60 && d>=50){
            System.out.println("Grade D, level 1, well below agancy standerds=  "+d);
        }
        else if(d<50 && d>=40){
            System.out.println("Grade E, level 1-, too below agancy standerds=  "+d);
        }
        else if(d<40 && d>=30){
            System.out.println("Grade R, Remedian Standard=  "+d);
        }
    }
}