package com.erp.service;

import java.util.List;

import com.erp.model.User;

/**
 * Created by Ravindra on 31/12/17.
 */
public interface UserService {
    User findByUsername(String username);

    List<User> findAllUsers();

}
