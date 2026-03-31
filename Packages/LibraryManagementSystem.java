public class LibraryManagementSystem {

    static class Book {
        private int bookId;
        private String title;
        private String author;
        private boolean isIssued;

        public Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.isIssued = false;
        }

        public void displayBook() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Issued: " + isIssued);
        }

        public void issueBook() {
            isIssued = true;
        }

        public boolean isIssued() {
            return isIssued;
        }

        public int getBookId() {
            return bookId;
        }
    }
    static class Member {
        private int memberId;
        private String name;

        public Member(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }

        public void displayMember() {
            System.out.println("Member ID: " + memberId);
            System.out.println("Name: " + name);
        }

        public int getMemberId() {
            return memberId;
        }
    }

    static class Transaction {
        public void issueBook(Book book, Member member) {
            if (!book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued successfully!");
                System.out.println("Book ID: " + book.getBookId() +
                                   " issued to Member ID: " + member.getMemberId());
            } else {
                System.out.println("Book is already issued.");
            }
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book(101, "Java Programming", "James Gosling");
        System.out.println("New Book Added:");
        book1.displayBook();

        System.out.println("-------------------");

        Member member1 = new Member(1, "Rahul");
        System.out.println("New Member Registered:");
        member1.displayMember();

        System.out.println("-------------------");

        Transaction transaction = new Transaction();
        transaction.issueBook(book1, member1);
    }
}