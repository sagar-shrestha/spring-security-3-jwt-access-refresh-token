package com.sagar.springsecurity3jwtaccessrefreshtoken.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String role;
    @ManyToMany(mappedBy = "roles")
    private Set<UserInfo> userInfo;
}
