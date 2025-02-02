package com.sagar.springsecurity3jwtaccessrefreshtoken.helper;

import com.sagar.springsecurity3jwtaccessrefreshtoken.entity.Roles;
import com.sagar.springsecurity3jwtaccessrefreshtoken.entity.UserInfo;
import com.sagar.springsecurity3jwtaccessrefreshtoken.repository.RolesRepository;
import com.sagar.springsecurity3jwtaccessrefreshtoken.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Slf4j
@RequiredArgsConstructor
public class DatabaseInitializer implements CommandLineRunner {

    private final UserInfoRepository userInfoRepository;
    private final RolesRepository rolesRepository;

    @Override
    public void run(String... args) {
        if (userInfoRepository.count() == 0 && rolesRepository.count() == 0) {
            Roles roles = Roles.builder()
                    .role("ADMIN")
                    .build();

            UserInfo userInfo = UserInfo.builder()
                    .username("admin")
                    .password("admin")
                    .email("sagar@gmail.com")
//                    .roles(Set.of(roles))
                    .build();

//            userInfo.add
            rolesRepository.save(roles);
            userInfoRepository.save(userInfo);

            log.info("Database initialization complete");
        } else {
            log.info("Database already initialized. Nothing to do.");
        }
    }
}
