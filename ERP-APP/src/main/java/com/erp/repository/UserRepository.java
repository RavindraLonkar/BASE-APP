package com.erp.repository;

import org.springframework.data.repository.CrudRepository;

import com.erp.model.User;

/**
 * Created by Ravindra on 31/12/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
