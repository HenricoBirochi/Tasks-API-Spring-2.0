package com.henrico.tasks.application.service.mapper;

import com.henrico.tasks.application.usecase.dto.input.UserInput;
import com.henrico.tasks.application.usecase.dto.output.UserOutput;
import com.henrico.tasks.domain.User;

public class UserServiceMapper {

    public static User userInputToUser(UserInput userInput) {
        return new User(
                userInput.getUserName(),
                userInput.getName(),
                userInput.getEmail(),
                userInput.getPassword()
        );
    }

    public static UserOutput userToUserOutput(User user) {
        return new UserOutput(
                user.getUserName(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getTotalCoins()
        );
    }

}
