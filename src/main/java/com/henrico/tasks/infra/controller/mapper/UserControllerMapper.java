package com.henrico.tasks.infra.controller.mapper;

import com.henrico.tasks.application.usecase.dto.input.UserInput;
import com.henrico.tasks.application.usecase.dto.output.UserOutput;
import com.henrico.tasks.infra.controller.dto.request.UserRequest;
import com.henrico.tasks.infra.controller.dto.response.UserResponse;

public class UserControllerMapper {

    public static UserInput userRequestToUserInput(UserRequest userRequestDto) {
        return new UserInput(
            userRequestDto.getUserName(),
            userRequestDto.getName(),
            userRequestDto.getEmail(),
            userRequestDto.getPassword()
        );
    }

    public static UserResponse userOutputToUserResponse(UserOutput userOutputDto) {
        return new UserResponse(
            userOutputDto.getUserName(),
            userOutputDto.getName(),
            userOutputDto.getEmail(),
            userOutputDto.getPassword(),
            userOutputDto.getTotalCoins()
        );
    }

}
