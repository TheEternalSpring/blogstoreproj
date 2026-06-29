package ge.edu.sangu.blogsiteproj.jsonplaceholder;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class jsonplaceholderHealthIndicator implements HealthIndicator {

    private final RestClient restClient;
    private final jsonplaceholderService jsonplaceholderService;


    @Override
    public Health health() {
        try {
            jsonplaceholderService.getAllPosts();

            return Health.up()
                    .withDetail("service", "Json placeholder API")
                    .withDetail("status", "reachable")
                    .build();
        } catch (Exception e) {
            return Health.down()
                    .withDetail("service", "Json placeholder API")
                    .withDetail("error", e.getMessage())
                    .build();
        }
    }
}