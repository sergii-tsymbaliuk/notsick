package com.epam.service;

import com.epam.entity.User;
import com.epam.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * JPA Implementation of User service.
 */
@Data
@Service
public class JpaUserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(User user) {
        user = getUserById(user.getId());
        userRepository.delete(user);
        return user;
    }

    @Override
    public User deleteUser(Long userId) {
        User user = getUserById(userId);
        userRepository.delete(userId);
        return user;
    }
}
