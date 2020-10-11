package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasurement;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/*
 * created by Hermann Sterling on 10/10/20
 */
public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasurement, Long> {


    Optional<UnitOfMeasurement> findByDescription(String description);

}
