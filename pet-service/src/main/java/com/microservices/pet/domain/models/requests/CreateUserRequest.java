package com.microservices.pet.domain.models.requests;

import lombok.Getter;

@Getter
public class CreateUserRequest {
    private String email;
    private String password;
}
