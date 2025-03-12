import java.util.ArrayList;
// Book class
class Book {
    // Attributes
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

// Library class demonstrating aggregation
class Library {
    // Attributes
    private String libraryName;
    private ArrayList<Book> libraryBooks;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.libraryBooks = new ArrayList<>();
    }

    // Method to add book in library
    public void addBook(Book book) {
        libraryBooks.add(book);
    }

    // Method to display libraries
    public void displayLibraryBooks() {
        System.out.println("Library Name: " + libraryName);
        for (Book book : libraryBooks) {
            book.displayBookDetails();
        }
        System.out.println("Total books in library are: " + libraryBooks.size());
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Creating libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        // Adding books to different libraries
        lib1.addBook(book1);
        lib1.addBook(book2);

        lib2.addBook(book2);
        lib2.addBook(book3);

        // Display books in each library
        lib1.displayLibraryBooks();
        System.out.println("---------------------------------");
        lib2.displayLibraryBooks();
    }
}

/*
Library Name: City Library
Title: 1984
Author: George Orwell

Title: To Kill a Mockingbird
Author: Harper Lee

Total books in library are: 2
---------------------------------
Library Name: University Library
Title: To Kill a Mockingbird
Author: Harper Lee

Title: The Great Gatsby
Author: F. Scott Fitzgerald

Total books in library are: 2
*/