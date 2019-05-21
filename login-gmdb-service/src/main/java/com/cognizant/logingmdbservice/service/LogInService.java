package com.cognizant.logingmdbservice.service;

import com.cognizant.logingmdbservice.DTO.UserDTO;
import com.cognizant.logingmdbservice.domain.Credential;
import com.cognizant.logingmdbservice.repository.LogInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LogInService {

    @Autowired
    LogInRepository logInRepository;

    public ResponseEntity<UserDTO> login(Credential credential) {
       boolean isValid = logInRepository.getOne(credential.getEmail()).equals(credential);
        Credential existiting = logInRepository.getOne(credential.getEmail());
        System.out.println(existiting + " " + credential);
       if(isValid){
           System.out.println("login service called with " + credential);
           String email = credential.getEmail();
           final String uri = "http://localhost:8089/user-email/"+email;
           System.out.println(uri);
           RestTemplate restTemplate = new RestTemplate();
           ResponseEntity<UserDTO> userDTO = restTemplate.getForEntity(uri, UserDTO.class);

           System.out.println(userDTO.getBody());

           return userDTO;
       }else {
           return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
       }
    }

    public void createCredential(Credential credential) {
        logInRepository.save(credential);
    }

    public void updateCredetial(Credential credential) {
        logInRepository.save(credential);
    }
}
