package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by oleksandr.kydiuk on Feb, 2019
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
