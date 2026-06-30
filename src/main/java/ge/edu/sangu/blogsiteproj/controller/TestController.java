package ge.edu.sangu.blogsiteproj.controller;

import ge.edu.sangu.blogsiteproj.jsonplaceholder.Post;
import ge.edu.sangu.blogsiteproj.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.Notification;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final NotificationService notificationService;

    @GetMapping("/test-async")
    @ResponseBody
    public String testAsync(){
        notificationService.sendNotification("Johnny","I feel so sigma!");
        return "retrieved message from Johnny!";
    }




}
