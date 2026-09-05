package com.henrico.tasks.infra.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrico.tasks.application.usecase.CreateUserUseCase;
import com.henrico.tasks.application.usecase.dto.input.UserInput;
import com.henrico.tasks.application.usecase.dto.output.UserOutput;
import com.henrico.tasks.infra.controller.dto.request.UserRequest;
import com.henrico.tasks.infra.controller.dto.response.UserResponse;
import com.henrico.tasks.infra.controller.mapper.UserControllerMapper;

@RestController
@RequestMapping("/user")
public class UserController {

    private final CreateUserUseCase createUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping
    public ResponseEntity<UserResponse> postUser(@RequestBody UserRequest userRequestDto) {
        UserInput userInput = UserControllerMapper.userRequestToUserInput(userRequestDto);
        UserOutput userOutput = createUserUseCase.createUser(userInput);
        UserResponse userResponse = UserControllerMapper.userOutputToUserResponse(userOutput);
        userResponse.setResponseMessage("The user was created!");
        return ResponseEntity.status(201).body(userResponse);
    }

}
