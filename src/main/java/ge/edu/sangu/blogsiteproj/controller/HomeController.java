package ge.edu.sangu.blogsiteproj.controller;


import ge.edu.sangu.blogsiteproj.jsonplaceholder.Post;
import ge.edu.sangu.blogsiteproj.jsonplaceholder.jsonplaceholderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final jsonplaceholderService jsonplaceholderService;

    @GetMapping({"/","/home","/index"})
    public String index(Model model){
        model.addAttribute("posts",jsonplaceholderService.getAllPosts());
        return "index";
    }

    @GetMapping("/posts")
    @ResponseBody
    public List<Post> posts(){
        return jsonplaceholderService.getAllPosts();
    }
}
