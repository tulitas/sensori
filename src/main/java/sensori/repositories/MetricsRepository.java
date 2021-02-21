package sensori.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sensori.models.Metrics;
@Repository
public interface MetricsRepository extends CrudRepository<Metrics, Long> {

    @Query(value = "SELECT * FROM sensors", nativeQuery = true)
    String getAll();

}
