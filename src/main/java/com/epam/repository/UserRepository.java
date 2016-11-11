package com.epam.repository;

import com.epam.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by stsym on 11/10/2016.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
