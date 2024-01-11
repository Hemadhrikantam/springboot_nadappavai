package Nadappavai.repository;

import Nadappavai.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    boolean existsByEmail(String email);
    User findByEmail(String username);
}
