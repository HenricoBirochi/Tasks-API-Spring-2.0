package com.henrico.tasks.infra.jpa.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrico.tasks.infra.jpa.db.UserJpa;

public interface UserRepositoryJpa extends JpaRepository<UserJpa, UUID> {
    Optional<UserJpa> findByUserName(String userName);
    Optional<UserJpa> findByEmail(String email);
}
