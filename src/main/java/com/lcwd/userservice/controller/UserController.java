package com.lcwd.userservice.controller;

import com.lcwd.userservice.entities.User;
import com.lcwd.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/test1")
    public ResponseEntity<User>createUser(User user){
        User user21 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user21);
    }

    // single user get
    @GetMapping("/Test2")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
       User user= userService.getUser(userId);
       return ResponseEntity.ok(user);

    }

    //all user get
    @GetMapping("/Test3")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser =userService.getAllUser();
        return  ResponseEntity.ok(allUser);
    }

    @GetMapping("/")
        public String sayhii(){
        return "Hello " ;
        }
    }
