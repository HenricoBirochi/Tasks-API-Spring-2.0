package com.henrico.tasks.infra.jpa.repository;

import com.henrico.tasks.domain.User;
import com.henrico.tasks.application.gateway.UserRepositoryGateway;
import com.henrico.tasks.infra.jpa.db.UserJpa;
import com.henrico.tasks.infra.jpa.mapper.UserMapper;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserRepository implements UserRepositoryGateway {

    private final UserRepositoryJpa userRepositoryJpa;

    public UserRepository(UserRepositoryJpa userRepositoryJpa) {
        this.userRepositoryJpa = userRepositoryJpa;
    }

    @Override
    public User saveUser(User user) {
        UserJpa userJpa = UserMapper.toUserJpa(user);
        UserJpa userFromDb = userRepositoryJpa.save(userJpa);
        return UserMapper.toUserDomain(userFromDb);
    }

    @Override
    public User findUserById(String userId) {
        UUID idAsUUID = UUID.fromString(userId);
        Optional<UserJpa> userFromDb = userRepositoryJpa.findById(idAsUUID);

        User userVerified = null;
        if(userFromDb.isPresent()) {
            userVerified = UserMapper.toUserDomain(userFromDb.get());
        }
        return userVerified;
    }

    @Override
    public User findUserByUserName(String userName) {
        Optional<UserJpa> userFromDb = userRepositoryJpa.findByUserName(userName);

        User userVerified = null;
        if(userFromDb.isPresent()) {
            userVerified = UserMapper.toUserDomain(userFromDb.get());
        }
        return userVerified;
    }

    @Override
    public User findUserByEmail(String email) {
        Optional<UserJpa> userFromDb = userRepositoryJpa.findByEmail(email);

        User userVerified = null;
        if(userFromDb.isPresent()) {
            userVerified = UserMapper.toUserDomain(userFromDb.get());
        }
        return userVerified;
    }

    @Override
    public List<User> findAllUsers() {
        return List.of();
    }

    @Override
    public User deleteUser(String userId) {
        return null;
    }


}
