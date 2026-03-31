class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0); // calls parameterized constructor
    }

    // Parameterized Constructor
    Circle(double r) {
        radius = r;
    }

    // Method to display radius
    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();      // default constructor
        Circle c2 = new Circle(5.0);   // parameterized constructor

        System.out.println("Default Circle:");
        c1.display();

        System.out.println("User-defined Circle:");
        c2.display();
    }
}