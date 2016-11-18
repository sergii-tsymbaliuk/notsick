package com.epam.service;

import com.epam.entity.User;

import java.util.List;

/**
 * User service interface.
 */
public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);
    User saveUser(User user);

    User deleteUser(User user);
    User deleteUser(Long userId);
}

