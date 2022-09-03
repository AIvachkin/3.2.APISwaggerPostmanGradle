package pro.sky.course_332.APISwaggerPostmanGradle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.course_332.APISwaggerPostmanGradle.model.Book;
import pro.sky.course_332.APISwaggerPostmanGradle.services.BookService;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookInfo(@PathVariable long id) {
        Book book = bookService.findBook(id);
        if (book == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }

    @GetMapping
    public ResponseEntity<Collection<Book>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @PutMapping
    public ResponseEntity<Book> editBook(@RequestBody Book book) {
        Book foundBook = bookService.editBook(book);
        if (foundBook == null){
//            return ResponseEntity.notFound().build();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//            return ResponseEntity.badRequest().build();

        }
        return ResponseEntity.ok(foundBook);
    }

    @DeleteMapping("/{id}")
    public Book deleteBook(@PathVariable long id) {
        return bookService.deleteBook(id);
    }


}
