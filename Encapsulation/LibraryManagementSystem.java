import java.util.*;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }
}

interface Reservable {
    void reserveItem(String name);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {

    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14; // 14 days
    }

    public void reserveItem(String name) {
        if (available) {
            setBorrowerName(name);
            available = false;
            System.out.println("Book reserved by " + name);
        } else {
            System.out.println("Book not available");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7; // 7 days
    }

    public void reserveItem(String name) {
        if (available) {
            setBorrowerName(name);
            available = false;
            System.out.println("Magazine reserved by " + name);
        } else {
            System.out.println("Magazine not available");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {

    private boolean available = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 3; // 3 days
    }

    public void reserveItem(String name) {
        if (available) {
            setBorrowerName(name);
            available = false;
            System.out.println("DVD reserved by " + name);
        } else {
            System.out.println("DVD not available");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Programming", "James Gosling"));
        items.add(new Magazine(2, "Tech Today", "Editorial Team"));
        items.add(new DVD(3, "Learning Java", "Tech Studio"));

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;

                if (r.checkAvailability()) {
                    r.reserveItem("Rahul");
                }
            }

            System.out.println("----------------------------");
        }
    }
}