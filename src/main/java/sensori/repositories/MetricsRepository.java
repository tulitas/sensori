package sensori.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sensori.models.Metrics;
@Repository
public interface MetricsRepository extends CrudRepository<Metrics, Integer> {

    @Query(value = "SELECT * FROM metrics where metric_id=2", nativeQuery = true)
    String getAll();

}
