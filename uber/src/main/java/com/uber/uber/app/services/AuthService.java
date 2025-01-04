package com.uber.uber.app.services;

import com.uber.uber.app.dto.SignupDto;
import com.uber.uber.app.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    UserDto onboardNewdriver(Long userId);


}
