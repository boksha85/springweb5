package guru.springframework.spring5werbapp.repositories;

import guru.springframework.spring5werbapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
