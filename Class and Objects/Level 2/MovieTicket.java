// MovieTicket class
class MovieTicket {

    // Attributes
    String movieName;
    String seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    // Method to book a ticket
    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    // Main method to test
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers");

        ticket.bookTicket("A10", 250.0);
        ticket.displayDetails();
    }
}