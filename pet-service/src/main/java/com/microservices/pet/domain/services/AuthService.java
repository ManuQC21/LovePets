package com.microservices.pet.domain.services;

import com.microservices.pet.domain.models.dto.UsuarioDto;
import com.microservices.pet.domain.models.entities.Usuario;
import com.microservices.pet.domain.models.requests.ChangePasswordRequest;
import com.microservices.pet.domain.models.requests.CreateUserRequest;
import com.microservices.pet.domain.models.requests.LoginRequest;

public interface AuthService {
    Usuario registerUser(CreateUserRequest createUserRequest);
    Usuario login(LoginRequest loginRequest);

    UsuarioDto changePassword(ChangePasswordRequest changePasswordRequest);

    void deleteUser(Long id);
}
