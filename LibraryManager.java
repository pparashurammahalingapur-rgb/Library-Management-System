import java.util.ArrayList;

public class LibraryManager {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {

        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("Book with this ISBN already exists.");
                return;
            }
        }

        books.add(book);
        System.out.println("Book Added Successfully.");
    }

    // View Books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("Library is Empty.");
            return;
        }

        for (Book b : books) {
            System.out.println("----------------------------");
            System.out.println(b);
        }
    }

    // Update Book
    public void updateBook(String isbn, String newTitle, String newAuthor, int newYear) {

        for (Book b : books) {

            if (b.getIsbn().equals(isbn)) {

                b.setTitle(newTitle);
                b.setAuthor(newAuthor);
                b.setPublicationYear(newYear);

                System.out.println("Book Updated Successfully.");
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    // Delete Book
    public void deleteBook(String isbn) {

        Book removeBook = null;

        for (Book b : books) {

            if (b.getIsbn().equals(isbn)) {
                removeBook = b;
                break;
            }
        }

        if (removeBook != null) {

            books.remove(removeBook);
            System.out.println("Book Deleted Successfully.");

        } else {

            System.out.println("Book Not Found.");
        }
    }

}