import java.util.Scanner;

public class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Circumference: %.2f\n", calculateCircumference());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.display();

        sc.close();
    }
}