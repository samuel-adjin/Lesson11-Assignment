package lesson11.prob2;

public class BookTest {
    public static void main(String[] args) {



        Library miuLibrary = new Library();
        // adding books to the library collection
        miuLibrary.addBook("978-0-123456-47-2", "Java Programming", "James Gosling");
        miuLibrary.addBook("978-1-234567-89-7", "Effective Java", "Joshua Bloch");
        miuLibrary.addBook("978-0-987654-32-1", "Clean Code", "Robert C. Martin");
        miuLibrary.addBook("978-1-234567-89-6", "Design Patterns", "Erich Gamma");
        miuLibrary.addBook("978-0-123456-78-9", "Head First Java", "Kathy Sierra");
        miuLibrary.addBook("978-0-765432-10-5", "Java Concurrency in Practice", "Brian Goetz");
        miuLibrary.addBook("978-0-543210-98-7", "Spring in Action", "Craig Walls");
        //adding a book which is already added to the library collection
        System.out.println(" ");
        miuLibrary.addBook("978-0-123456-47-2", "Java Programming", "James Gosling");
        //Get Book Details using ISBN
        System.out.println(" ");
        System.out.println("Book details: " + miuLibrary.getBookDetails("978-0-123456-47-2"));
        //borrow Java Programming book from the library
        System.out.println(" ");
        miuLibrary.borrowBook("978-0-123456-47-2");
        //borrow Java Programming book from the library again
        miuLibrary.borrowBook("978-0-123456-47-2");
        //borrow book that is not in the Library :
        miuLibrary.borrowBook("978-0-123456-47-255");
        //borrow Spring in Action book from the library
        miuLibrary.borrowBook("978-0-543210-98-7");
        System.out.println(" ");
        //check borrowed status of Spring in Action
        System.out.println("is Spring In Action borrowed: " + miuLibrary.isBookBorrowed("978-0-543210-98-7"));
        //check borrowed status of Clean Code
        System.out.println("is Clean Code borrowed: " + miuLibrary.isBookBorrowed("978-0-987654-32-1"));
        //List all books in the library including borrowed books
        System.out.println(" ");
        miuLibrary.listAllBooks();
        System.out.println(" ");
        //List all borrowed Books
        miuLibrary.listBorrowedBooks();

    }
}
