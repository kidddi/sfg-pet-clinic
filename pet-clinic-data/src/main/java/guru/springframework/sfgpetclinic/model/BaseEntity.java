package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by oleksandr.kydiuk on Feb, 2019
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    BaseEntity(Long id) {
        this.id = id;
    }

    BaseEntity() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
