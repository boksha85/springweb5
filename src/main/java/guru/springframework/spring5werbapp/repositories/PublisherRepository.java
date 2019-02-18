package guru.springframework.spring5werbapp.repositories;

import guru.springframework.spring5werbapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
