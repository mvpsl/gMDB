package com.cognizant.usergmdbservice.controller;

import com.cognizant.usergmdbservice.DTO.CredentialDTO;
import com.cognizant.usergmdbservice.domain.User;
import com.cognizant.usergmdbservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
public class UserController {




    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public String testService(){
        return "user service";
    }

    @PostMapping(value = "/createuser")
    public ResponseEntity<User> createUser(@RequestBody User user){



        return new ResponseEntity<User>(userService.createUser(user), HttpStatus.OK);
    }


    @GetMapping(value = "/all-users")
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }


    @GetMapping(value = "/user-id/{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
    }


    @PutMapping(value = "/update-user")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.OK);
    }



}
