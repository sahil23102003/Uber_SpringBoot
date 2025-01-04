package com.uber.uber.app.dto;

import com.uber.uber.app.entities.enums.Roles;

import java.util.Set;

public class UserDto {
    private String name;
    private String email;
    private Set<Roles> roles;
}
