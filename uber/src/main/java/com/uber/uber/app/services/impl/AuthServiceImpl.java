package com.uber.uber.app.services.impl;

import com.uber.uber.app.dto.SignupDto;
import com.uber.uber.app.dto.UserDto;
import com.uber.uber.app.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public UserDto onboardNewdriver(Long userId) {
        return null;
    }
}
