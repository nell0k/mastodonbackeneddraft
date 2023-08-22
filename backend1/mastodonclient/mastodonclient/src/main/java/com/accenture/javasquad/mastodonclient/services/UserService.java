package com.accenture.javasquad.mastodonclient.services;

import com.accenture.javasquad.mastodonclient.entities.User;
import com.accenture.javasquad.mastodonclient.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> readAllUsers() {

        return userRepository.findAll();
    }

    public User addUser(User user) {

        return userRepository.save(user);
    }
}

