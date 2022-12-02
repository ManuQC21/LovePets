package com.microservices.pet.domain.services.impl;

import com.microservices.pet.domain.mappers.UsuarioMapper;
import com.microservices.pet.domain.models.dto.UsuarioDto;
import com.microservices.pet.domain.models.entities.Adoptante;
import com.microservices.pet.domain.models.entities.Usuario;
import com.microservices.pet.domain.models.requests.ChangePasswordRequest;
import com.microservices.pet.domain.models.requests.CreateUserRequest;
import com.microservices.pet.domain.models.requests.LoginRequest;
import com.microservices.pet.domain.repositories.AdminRepository;
import com.microservices.pet.domain.repositories.AdoptanteRepository;
import com.microservices.pet.domain.repositories.UsuarioRepository;
import com.microservices.pet.domain.services.AuthService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.time.LocalDate;

@Slf4j
@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private UsuarioRepository usuarioRepository;
    private AdoptanteRepository adoptanteRepository;
    private AdminRepository adminRepository;

    @Override
    public Usuario registerUser(CreateUserRequest createUserRequest) {
        Usuario toSave = new Usuario();
        toSave.setEmail(createUserRequest.getEmail());
        toSave.setPassword(createUserRequest.getPassword());
        Usuario savedToDb = this.usuarioRepository.save(toSave);

        Adoptante adoptanteToSave = new Adoptante();
        adoptanteToSave.setUsuario(savedToDb);
        adoptanteToSave.setFechaRegistro(LocalDate.now());

        Adoptante savedAdoptante = this.adoptanteRepository.save(adoptanteToSave);
        Usuario toReturn = this.usuarioRepository.getById(savedToDb.getId());

        log.error("[SAVED]: " + toReturn.toString());
        return toReturn;
    }

    @Override
    public Usuario login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public UsuarioDto changePassword(ChangePasswordRequest changePasswordRequest) {
        Usuario retrievedFromDb = this.usuarioRepository.getById(changePasswordRequest.getUserId());
        String currentPassword = retrievedFromDb.getPassword();
        if (currentPassword.equals(changePasswordRequest.getOldPassword())) {
            retrievedFromDb.setPassword(changePasswordRequest.getNewPassword());
            UsuarioDto usuarioDto = UsuarioMapper.INSTANCE.usuarioToUsuarioDto(retrievedFromDb);
            return usuarioDto;
        }
        throw new InvalidParameterException("AEEEA");
    }

    @Override
    public void deleteUser(Long id) {
        this.usuarioRepository.deleteById(id);
    }


}
