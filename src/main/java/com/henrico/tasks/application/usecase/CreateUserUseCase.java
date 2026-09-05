package com.henrico.tasks.application.usecase;

import com.henrico.tasks.application.usecase.dto.input.UserInput;
import com.henrico.tasks.application.usecase.dto.output.UserOutput;

public interface CreateUserUseCase {

    UserOutput createUser(UserInput user);

}
