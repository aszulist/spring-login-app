package eu.purecode.springloginapp.repository;

import eu.purecode.springloginapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
