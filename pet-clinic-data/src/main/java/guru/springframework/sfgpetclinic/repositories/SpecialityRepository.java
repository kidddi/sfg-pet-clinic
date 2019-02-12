package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by oleksandr.kydiuk on Feb, 2019
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
