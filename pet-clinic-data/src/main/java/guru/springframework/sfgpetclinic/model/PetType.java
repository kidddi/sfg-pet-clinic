package guru.springframework.sfgpetclinic.model;

/**
 * Created by oleksandr.kydiuk on Feb, 2019
 */
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
