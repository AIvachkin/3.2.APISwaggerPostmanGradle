package pro.sky.course_332.APISwaggerPostmanGradle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.course_332.APISwaggerPostmanGradle.model.BookCover;

import java.util.Optional;

@Repository
public interface BookCoverRepository extends JpaRepository<BookCover, Long> {

    Optional<BookCover> findByBookId(Long bookId);
}
