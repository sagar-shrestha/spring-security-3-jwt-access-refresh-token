package com.sagar.springsecurity3jwtaccessrefreshtoken.repository;

import com.sagar.springsecurity3jwtaccessrefreshtoken.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    UserInfo findByUsername(String username);
}
