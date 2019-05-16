package com.cognizant.logingmdbservice.service;

import com.cognizant.logingmdbservice.domain.Credential;
import com.cognizant.logingmdbservice.repository.LogInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogInService {

    @Autowired
    LogInRepository logInRepository;

    public void login(Credential credential) {
        logInRepository.getOne(credential.getEmail()).equals(credential);
    }

    public void createCredential(Credential credential) {
        logInRepository.save(credential);
    }

    public void updateCredetial(Credential credential) {
        logInRepository.save(credential);
    }
}
