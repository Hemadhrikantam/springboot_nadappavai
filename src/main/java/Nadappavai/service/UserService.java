package Nadappavai.service;

import Nadappavai.dao.UserDao;
import Nadappavai.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
   private UserDao userDao;

    public boolean saveUser(User user) {
        // Check if user with the given email already exists
        if (userDao.existsByEmail(user.getEmail())) {
            return false; // User already exists
        }

        user.setUsername(user.getUsername());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        // Save the new user
        userDao.saveUser(user);

        return true; // User registered successfully
    }
}
