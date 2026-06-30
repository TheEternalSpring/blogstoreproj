package ge.edu.sangu.blogsiteproj.service;

import ge.edu.sangu.blogsiteproj.jsonplaceholder.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationService {




    @Async
    public void sendNotification(String userId, String message) {
        log.info("Sending notification on thread: {}", Thread.currentThread().getName());
        // Simulate slow operation
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        log.info("Notification sent to user: {}", userId);
    }

}
