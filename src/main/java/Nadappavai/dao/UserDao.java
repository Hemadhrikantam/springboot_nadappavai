package Nadappavai.dao;

import Nadappavai.dto.User;
import Nadappavai.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private UserRepo userRepo;
    public boolean existsByEmail(String email) {
        return userRepo.existsByEmail(email);
    }
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
