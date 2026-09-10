package com.henrico.tasks.application.service;

import com.henrico.tasks.application.gateway.UserRepositoryGateway;
import com.henrico.tasks.application.service.exception.UserAlreadyRegisteredException;
import com.henrico.tasks.application.service.mapper.UserServiceMapper;
import com.henrico.tasks.application.usecase.CreateUserUseCase;
import com.henrico.tasks.application.usecase.dto.input.UserInput;
import com.henrico.tasks.application.usecase.dto.output.UserOutput;
import com.henrico.tasks.domain.User;
import com.henrico.tasks.domain.enums.UserRole;

public class CreateUserService implements CreateUserUseCase {

    private final UserRepositoryGateway userRepositoryGateway;

    public CreateUserService(UserRepositoryGateway userRepositoryGateway) {
        this.userRepositoryGateway = userRepositoryGateway;
    }

    @Override
    public UserOutput createUser(UserInput user) {
        isUserNameOrEmailAlreadyRegistered(user.getUserName(), user.getEmail());
        return createUserInDb(user);
    }

    private void isUserNameOrEmailAlreadyRegistered(String userName, String email) {
        User userFromDb = userRepositoryGateway.findUserByUserName(userName);
        if(userFromDb != null) {
            throw new UserAlreadyRegisteredException("The user " + userFromDb.getUserName() + " is already registered!");
        }
        User userFromDb2 = userRepositoryGateway.findUserByEmail(email);
        if(userFromDb2 != null) {
            throw new UserAlreadyRegisteredException("The user " + userFromDb2.getEmail() + " is already registered!");
        }
    }

    private UserOutput createUserInDb(UserInput userInput) {
        User user = UserServiceMapper.userInputToUser(userInput);
        setEmptyFields(user);
        User userFromDb = userRepositoryGateway.saveUser(user);
        return UserServiceMapper.userToUserOutput(userFromDb);
    }

    private void setEmptyFields(User user) {
        user.setTotalCoins(0);
        user.setUserRole(UserRole.NORMAL);
    }

}
