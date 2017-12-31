package com.erp.repository;

import org.springframework.data.repository.CrudRepository;

import com.erp.model.Role;

/**
 * Created by Ravindra on 31/12/17.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}
