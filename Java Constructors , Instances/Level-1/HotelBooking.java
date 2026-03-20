class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // Copy Constructor
    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Aman", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.display();
        System.out.println();
        b2.display();
        System.out.println();
        b3.display();
    }
}