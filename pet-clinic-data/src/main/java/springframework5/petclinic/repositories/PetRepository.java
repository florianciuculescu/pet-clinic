package springframework5.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
