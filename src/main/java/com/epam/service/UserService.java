package com.epam.service;

import com.epam.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by stsym on 10/25/2016.
 */
public interface UserService {

    List<User> getAllUsers();

    User getById(Long id);
}

