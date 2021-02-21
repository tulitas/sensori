package sensori.repositories;

import org.springframework.data.repository.CrudRepository;
import sensori.models.Sensors;

public interface SensorsRepository extends CrudRepository<Sensors, Long> {
}
