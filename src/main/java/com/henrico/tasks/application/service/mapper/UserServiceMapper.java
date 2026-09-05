package com.henrico.tasks.application.service.mapper;

import com.henrico.tasks.application.usecase.dto.input.UserInput;
import com.henrico.tasks.application.usecase.dto.output.UserOutput;
import com.henrico.tasks.domain.User;

public class UserServiceMapper {

    public static User userInputDtoToUser(UserInput userInputDTO) {
        return new User(
                userInputDTO.getUserName(),
                userInputDTO.getName(),
                userInputDTO.getEmail(),
                userInputDTO.getPassword()
        );
    }

    public static UserOutput userToUserOutputDto(User user) {
        return new UserOutput(
                user.getUserName(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getTotalCoins()
        );
    }

}
