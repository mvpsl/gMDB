package com.cognizant.usergmdbservice.service;


import com.cognizant.usergmdbservice.DTO.CredentialDTO;
import com.cognizant.usergmdbservice.domain.User;
import com.cognizant.usergmdbservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
        final String uri = "http://localhost:8082/sign-up";
        RestTemplate restTemplate = new RestTemplate();
        Boolean result = restTemplate.postForObject(uri, new CredentialDTO(user.getEmail(), user.getPassword()), Boolean.class);

        System.out.println(result);

        return userRepository.save(user);
    }
}
