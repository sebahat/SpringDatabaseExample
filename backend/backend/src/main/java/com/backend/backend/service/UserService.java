package com.backend.backend.service;

import com.backend.backend.model.User;
import com.backend.backend.repsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

}
