package ge.edu.sangu.blogsiteproj.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@RequiredArgsConstructor
@Service
public class UserService {


    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public User getUserByUsername(String username){
        return repository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(
                        "User not found: %s".formatted(username)));
    }

    public void registerUser(String username, String plainPassword) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(plainPassword));
        user.setRoles(Set.of("USER"));
        repository.save(user);
    }
}
