package com.microservices.pet.application.controllers.impl;

import com.microservices.pet.application.controllers.contracts.AuthController;
import com.microservices.pet.domain.mappers.UsuarioMapper;
import com.microservices.pet.domain.models.dto.UsuarioDto;
import com.microservices.pet.domain.models.entities.Usuario;
import com.microservices.pet.domain.models.requests.ChangePasswordRequest;
import com.microservices.pet.domain.models.requests.CreateUserRequest;
import com.microservices.pet.domain.models.requests.LoginRequest;
import com.microservices.pet.domain.services.AuthService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.InvalidParameterException;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(path = "auth")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthControllerImpl implements AuthController {

    private AuthService authService;

    @Override
    public ResponseEntity<UsuarioDto> login(LoginRequest loginRequest) {

        try {
            UsuarioDto authenticated = authService.login(loginRequest);
            return new ResponseEntity<>(authenticated, HttpStatus.OK);
        } catch (InvalidParameterException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<UsuarioDto> register(CreateUserRequest createUserRequest) {

        Usuario usuario = this.authService.registerUser(createUserRequest);
        UsuarioDto usuarioDto = UsuarioMapper.INSTANCE.usuarioToUsuarioDto(usuario);

        return new ResponseEntity<>(usuarioDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UsuarioDto> changePassword(ChangePasswordRequest changePasswordRequest) {
        UsuarioDto updated = this.authService.changePassword(changePasswordRequest);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteUser(Long id) {
        this.authService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
