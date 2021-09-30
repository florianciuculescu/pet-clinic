package springframework5.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
