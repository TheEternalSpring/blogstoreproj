package ge.edu.sangu.blogsiteproj.jsonplaceholder;

import lombok.Data;

@Data
public class Post {
    private long id;
    private  long userID;
    private String title;
    private String body;
}
