package guru.springframework.spring5werbapp.repositories;

import guru.springframework.spring5werbapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
