package com.henrico.tasks.application.gateway;

import com.henrico.tasks.domain.User;

import java.util.List;

public interface UserRepositoryGateway {

    User saveUser(User user);
    User findUserById(String userId);
    User findUserByUserName(String userName);
    User findUserByEmail(String email);
    List<User> findAllUsers();
    User deleteUser(String userId);

}