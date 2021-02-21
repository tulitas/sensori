package sensori.repositories;

import org.springframework.data.repository.CrudRepository;
import sensori.models.Units;

public interface UnitsRepository extends CrudRepository<Units, Long> {
}
