package sensori.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sensori.models.Measures;

@Repository
public interface SensorRepository extends CrudRepository<Measures, Long> {
}
