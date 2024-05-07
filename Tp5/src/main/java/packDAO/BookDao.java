package packDAO;
import java.util.List;

public interface BookDao {
    void addBook(BookBean book);
    void updateBook(BookBean book);
    void deleteBook(Long book_id);
    List<BookBean> displayAll();
    BookBean findBook(String kw);
}
