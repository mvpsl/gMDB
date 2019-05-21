package com.cognizant.logingmdbservice.controller;

import com.cognizant.logingmdbservice.DTO.UserDTO;
import com.cognizant.logingmdbservice.domain.Credential;
import com.cognizant.logingmdbservice.service.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class LogInController {
    @Autowired
    LogInService loginService;

    @GetMapping(value = "/")
    public String testService(){
        return "Log in service";
    }

    @PostMapping(value = "login")
    public ResponseEntity<UserDTO> login(@RequestBody Credential credential){
        System.out.println("from log in area");
        return loginService.login(credential);
    }

    @PostMapping(value = "sign-up")
    public ResponseEntity<Boolean> createCredential(@RequestBody Credential credential){
        System.out.println("we are here!");
        loginService.createCredential(credential);

        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }


    @PutMapping(value = "update-login")
    public ResponseEntity<Boolean> updateCredetial(@RequestBody Credential credential){
        loginService.updateCredetial(credential);
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }
}
