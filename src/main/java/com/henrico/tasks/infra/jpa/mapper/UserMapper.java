package com.henrico.tasks.infra.jpa.mapper;

import com.henrico.tasks.domain.User;
import com.henrico.tasks.infra.jpa.db.UserJpa;

public class UserMapper {

    public static UserJpa toUserJpa(User user){
        return UserJpa.builder()
                .userName(user.getUserName())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .totalCoins(user.getTotalCoins())
                .userRole(user.getUserRole())
                .build();
    }

    public static User toUserDomain(UserJpa userJpa){
        return new User(
                userJpa.getId().toString(),
                userJpa.getUserName(),
                userJpa.getName(),
                userJpa.getEmail(),
                userJpa.getPassword(),
                userJpa.getTotalCoins(),
                userJpa.getUserRole()
        );
    }

}
