package com.henrico.tasks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.henrico.tasks.application.service.CreateUserService;
import com.henrico.tasks.application.usecase.CreateUserUseCase;
import com.henrico.tasks.infra.jpa.repository.UserRepository;
import com.henrico.tasks.infra.jpa.repository.UserRepositoryJpa;

@Configuration
public class CreateUserUseCaseConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserRepositoryJpa userRepositoryJpa) {
        return new CreateUserService(new UserRepository(userRepositoryJpa));
    }

}
