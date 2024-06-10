package parcial2.univsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import parcial2.univsys.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
