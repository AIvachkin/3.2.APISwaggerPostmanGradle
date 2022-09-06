package pro.sky.course_332.APISwaggerPostmanGradle.services;

import org.springframework.stereotype.Service;
import pro.sky.course_332.APISwaggerPostmanGradle.model.Book;
import pro.sky.course_332.APISwaggerPostmanGradle.repositories.BookRepository;
import java.util.Collection;


@Service
public class BookService {

//    private final HashMap<Long, Book> books = new HashMap<>();
//    private long lastId = 0;
// убираем, т.к. теперь хранилищем будет выступать БД


    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
//        book.setId(++lastId);
//        books.put(lastId, book);
//        return book;

        return bookRepository.save(book);
    }


    public Book findBook(long id) {
//        return books.get(id);
        return bookRepository.findById(id).get();
    }


    public Book editBook(Book book) {
//        if (books.containsKey(book.getId())) {
//            books.put(book.getId(), book);
//            return book;
//        }
//        return null;

        return bookRepository.save(book);
    }

    public void deleteBook(long id) {
//        return books.remove(id);
        bookRepository.deleteById(id);
    }

    public Collection<Book> getAllBooks() {
//        return books.values();
        return bookRepository.findAll();
    }
}
