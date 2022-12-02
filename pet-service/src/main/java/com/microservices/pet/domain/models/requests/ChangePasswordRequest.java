package com.microservices.pet.domain.models.requests;

import lombok.Getter;

@Getter
public class ChangePasswordRequest {
    private Long userId;
    private String oldPassword;
    private String newPassword;
}
