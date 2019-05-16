package com.cognizant.usergmdbservice.service;


import com.cognizant.usergmdbservice.domain.User;
import com.cognizant.usergmdbservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(long id) {
       return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User createUser(User user) {
        //create an credential accountls

        return userRepository.save(user);
    }
}
