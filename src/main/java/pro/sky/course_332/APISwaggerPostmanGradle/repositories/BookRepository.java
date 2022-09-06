package pro.sky.course_332.APISwaggerPostmanGradle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.course_332.APISwaggerPostmanGradle.model.Book;


public interface BookRepository extends JpaRepository <Book, Long> {

}
