package ge.edu.sangu.blogsiteproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping({"/contact","/contact-us"})
    public String contact(){
        return "contact";
    }
}
