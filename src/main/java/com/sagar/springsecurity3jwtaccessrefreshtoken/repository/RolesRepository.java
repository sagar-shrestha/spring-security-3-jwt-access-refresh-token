package com.sagar.springsecurity3jwtaccessrefreshtoken.repository;

import com.sagar.springsecurity3jwtaccessrefreshtoken.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
