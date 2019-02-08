package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oleksandr.kydiuk on Feb, 2019
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.index"})
    public String listVets() {

        return "vets/index";
    }
}
