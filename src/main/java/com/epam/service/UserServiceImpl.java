package com.epam.service;

import com.epam.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * HashMap UserService implementation.
 */
@Service
public class UserServiceImpl implements UserService {
    private static Long idGenerator = 0L;
    private final Map<Long,User> users;

    public UserServiceImpl(){
        this.users = new HashMap<>();
    }

    @Override
    public List<User> getAllUsers(){
        return this.users.values().stream().collect(Collectors.toList());
    }

    @Override
    public User getUserById(Long id) {
        return users.get(id);
    }

    @Override
    public User saveUser(User user) {
        if (user.getId() == null){
            user.setId(idGenerator++);
        }

        return this.users.put(user.getId(), user);
    }

    @PostConstruct
    public void init(){
        saveUser(new User(/*Name:*/ "Administrator", /*login:*/ "admin"));
        saveUser(new User(/*Name:*/ "User", /*login:*/ "user"));
    }
}
