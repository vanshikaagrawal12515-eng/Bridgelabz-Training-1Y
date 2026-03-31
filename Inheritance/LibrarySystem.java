class Author {
    String name;
    String bio;

    Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    void displayAuthor() {
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

class Book {
    String title;
    int publicationYear;
    Author author;

    Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        author.displayAuthor();
        System.out.println();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Author a1 = new Author("James Gosling", "Father of Java");
        Author a2 = new Author("Dennis Ritchie", "Creator of C");

        Book b1 = new Book("Java Programming", 2020, a1);
        Book b2 = new Book("C Programming", 1978, a2);

        b1.displayInfo();
        b2.displayInfo();
    }
}