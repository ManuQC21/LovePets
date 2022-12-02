package com.microservices.pet.application.controllers.contracts;

import com.microservices.pet.domain.models.dto.UsuarioDto;
import com.microservices.pet.domain.models.requests.ChangePasswordRequest;
import com.microservices.pet.domain.models.requests.CreateUserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface AuthController {

    @PostMapping(path = "/login")
    ResponseEntity<UsuarioDto> login();

    @PostMapping(path = "/register")
    ResponseEntity<UsuarioDto> register(@RequestBody CreateUserRequest createUserRequest);

    @PatchMapping(path = "/change-password")
    ResponseEntity<UsuarioDto> changePassword(@RequestBody ChangePasswordRequest changePasswordRequest);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> deleteUser(@PathVariable Long id);

}
