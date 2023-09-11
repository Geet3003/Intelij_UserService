package com.lcwd.userservice.services;

import com.lcwd.userservice.entities.User;

import java.util.List;

public interface UserService {
    // user operations
    User saveUser(User user);
    // get All List
    List<User> getAllUser();
    // get user by Id
    User getUser(String userId);



}
