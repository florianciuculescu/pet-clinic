package springframework5.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
