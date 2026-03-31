class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    // Default Constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Not Assigned";
        rentalDays = 0;
        costPerDay = 0.0;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    // Main method to test the class
    public static void main(String[] args) {
        CarRental rental = new CarRental("Rahul", "Toyota Corolla", 5, 2000);
        rental.displayDetails();
    }
}