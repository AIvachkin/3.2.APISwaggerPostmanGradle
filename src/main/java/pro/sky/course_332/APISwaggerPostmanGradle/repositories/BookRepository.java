package pro.sky.course_332.APISwaggerPostmanGradle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.course_332.APISwaggerPostmanGradle.model.Book;

import java.util.Collection;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByNameIgnoreCase(String name);

    Collection<Book> findBooksByAuthorIgnoreCase(String author);

    Collection<Book> findAllByNameContainsIgnoreCase(String part);
    Collection<Book> findBooksByNameAndAuthor(String name, String author);

    Collection<Book> findBooksByNameOrAuthor (String nane, String author);

    Collection<Book> findBooksByNameOrAuthorAndIdGreaterThan (String nane, String author, Long number);



}
