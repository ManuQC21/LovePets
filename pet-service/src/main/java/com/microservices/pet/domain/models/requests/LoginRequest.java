package com.microservices.pet.domain.models.requests;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String email;
    private String password;
}
