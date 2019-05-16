//package com.cognizant.usergmdbservice.controller;
//
//
//import com.cognizant.usergmdbservice.domain.User;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class UserControllerTest {
//
//
//    User user;
//
//    UserController userController;
//    ArrayList<User> usersList;
//
//    @Before
//    public void setup(){
//        userController= new UserController();
//        user = new User(1l, "par","sol", "email", "xys");
//        usersList = new ArrayList<>();
//        usersList.add(user);
//    }
//
//    @After
//    public  void closeUp(){
//        User user = null;
//        UserController userController= null;
//    }
//
//
//
//    @Test
//    public void createUserTest() {
//        //excution
//         ResponseEntity<User>  expectedUser  =  userController.createUser(user);
//
//         //assert
//         assertEquals(expectedUser.getStatusCode(), HttpStatus.OK);
//         assertEquals(expectedUser.getBody(), user);
//
//    }
//    @Test
//    public void getUserTest(){
//
//        UserController userController = mock(UserController.class);
////        when(userController.getUsers()).thenReturn(usersList);
//
//        ResponseEntity<List<User>> expectedUser =  userController.getUsers();
//
//
////        assertEquals(expectedUser, usersList);
//
//
//    }
//
//    @Test
//    public void getUserById() {
//
//
//    }
//}