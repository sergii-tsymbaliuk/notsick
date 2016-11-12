package com.epam.repository;

import com.epam.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * User CRUD Repository
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
