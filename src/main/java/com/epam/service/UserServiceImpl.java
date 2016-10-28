package com.epam.service;

import com.epam.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stsym on 10/25/2016.
 */
@Component
public class UserServiceImpl implements UserService {
    List<User> users;
    public UserServiceImpl(){
        users = new ArrayList<>();
        users.add(new User("Jonny", "john"));
        users.add(new User("Ivan Petrov", "petrovi"));
    }

    @Override
    public List<User> getAllUsers(){
        return this.users;
    }
}
