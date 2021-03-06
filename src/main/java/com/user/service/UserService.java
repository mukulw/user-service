package com.user.service;

import com.user.model.CreateUser;
import com.user.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Integer userId);

    String createUser(CreateUser user);
}
