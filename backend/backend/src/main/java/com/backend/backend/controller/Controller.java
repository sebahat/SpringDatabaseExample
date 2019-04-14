package com.backend.backend.controller;


import com.backend.backend.exception.UserNotFoundException;
import com.backend.backend.model.User;
import com.backend.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    UserService userService;

    @PostMapping(path = "/members")
    private User getUser(@RequestBody String username) {
        User user = userService.findByUserName(username);
        if (user == null) {
            throw new UserNotFoundException("User not found exception" + username);
        }
        return user;
    }
}
