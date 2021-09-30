package springframework5.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.petclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
