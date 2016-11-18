package com.epam.controller;

import com.epam.entity.Note;
import com.epam.entity.User;
import com.epam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User REST controller
 */
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUser(){
        return userService.getAllUsers();
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public User putUser(@ModelAttribute User user){
        return userService.saveUser(user);
    }

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long userId){
        return userService.getUserById(userId);
    }
}
