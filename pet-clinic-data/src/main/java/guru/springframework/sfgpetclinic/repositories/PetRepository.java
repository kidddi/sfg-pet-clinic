package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by oleksandr.kydiuk on Feb, 2019
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
