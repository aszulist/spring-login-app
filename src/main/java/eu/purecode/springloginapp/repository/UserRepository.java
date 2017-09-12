package eu.purecode.springloginapp.repository;

import eu.purecode.springloginapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
