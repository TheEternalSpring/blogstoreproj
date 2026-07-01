package ge.edu.sangu.blogsiteproj.controller;


import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
@RequiredArgsConstructor
public class ProfileController {

    private final MessageSource messageSource;

    @GetMapping({"/profile"})
    public String profile(Model model, Authentication authentication, Locale locale){
        //String message = messageSource.getMessage("welcome.user", new Object[]{authentication.getPrincipal()}, locale);
        model.addAttribute("welcomeMessage","User");
        return "profile";
    }
}
