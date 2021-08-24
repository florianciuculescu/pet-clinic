package springframework5.petclinic.services;

import java.util.Set;
/**
 * Mimicking the Spring Data repositories
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
