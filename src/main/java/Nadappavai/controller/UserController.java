package Nadappavai.controller;

import Nadappavai.dto.User;
import Nadappavai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("saveuser")

    public boolean saveUser(@RequestBody User user){
        return  userService.saveUser(user);
    }
}
