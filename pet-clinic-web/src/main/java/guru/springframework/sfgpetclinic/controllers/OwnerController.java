package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oleksandr.kydiuk on Feb, 2019
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/index", "/index.index"})
    public String listOwners() {

        return "/owners/index";
    }
}
