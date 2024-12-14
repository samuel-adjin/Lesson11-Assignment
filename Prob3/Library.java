package lesson11.prob2;

import java.util.HashMap;


public class Library {

    private final HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }


    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.println("Book not added. Book already exists in the Library");
        } else {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.println(title + " by " + author + " added to the library ");
        }

    }

    public void borrowBook(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book is not part of the library Collections");
        } else if (isBookBorrowed(ISBN)) {
            System.out.println("Book is already borrowed");
        } else {
            Book book = books.get(ISBN);
            book.setBorrowed(true);
            System.out.println("Book borrowed");
        }
    }

    public void returnBook(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book is not part of the library Collections");
        } else if (isBookBorrowed(ISBN)) {
            Book book = books.get(ISBN);
            book.setBorrowed(false);
            System.out.println("Thanks for returning the book");
        } else {
            System.out.println("Book has not been borrowed. Therefore can not be returned");
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        if (!books.containsKey(ISBN)) {
            return false;
        }
        Book book = books.get(ISBN);
        return book.isBorrowed();
    }

    public Book getBookDetails(String ISBN) {
        return books.get(ISBN);
    }

    public void listAllBooks() {
        for (String key : books.keySet()) {
            Book book = books.get(key);
            System.out.println(book);
        }
    }

    public void listBorrowedBooks() {
        for (String key : books.keySet()) {
            Book book = books.get(key);
            if (book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }

}
