package springframework5.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework5.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
