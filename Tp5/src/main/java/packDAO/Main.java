package packDAO;

import packDAO.*;
import java.util.List;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();

        try {
            // Display all records from the book table
            List<BookBean> allBooks = bookDao.displayAll();
            for (BookBean book : allBooks) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Price: " + book.getPrice());
            }

            // Insert a new book
            BookBean newBook = new BookBean();
            newBook.setTitle("New Book");
            newBook.setAuthor("New Author");
            newBook.setPrice(19.99f);
            bookDao.addBook(newBook);

            // Display the newly added book
            System.out.println("Newly Added Book:");
            System.out.println(newBook.getTitle() + " by " + newBook.getAuthor() + " - Price: " + newBook.getPrice());

            // Update the price of the new book
            newBook.setPrice(24.99f);
            bookDao.updateBook(newBook);

            // Delete a book
            long bookIdToDelete = 1; // Assuming book_id 1 needs to be deleted
            bookDao.deleteBook(bookIdToDelete);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
