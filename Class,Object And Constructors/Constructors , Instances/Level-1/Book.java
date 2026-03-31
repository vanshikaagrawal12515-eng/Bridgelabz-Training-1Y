class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        System.out.println("Default Constructor Book:");
        b1.display();

        System.out.println();

        // Using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 499.99);
        System.out.println("Parameterized Constructor Book:");
        b2.display();
    }
}