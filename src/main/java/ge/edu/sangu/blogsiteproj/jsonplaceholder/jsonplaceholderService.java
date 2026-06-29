package ge.edu.sangu.blogsiteproj.jsonplaceholder;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class jsonplaceholderService {

    private final RestClient jsonPlaceholderClient;

    public List<Post> getAllPosts(){
        return jsonPlaceholderClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {});

    }
}
