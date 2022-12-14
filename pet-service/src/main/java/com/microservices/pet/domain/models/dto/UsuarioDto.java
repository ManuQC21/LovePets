package com.microservices.pet.domain.models.dto;

import com.microservices.pet.domain.models.entities.Usuario;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Usuario} entity
 */
@Data
public class UsuarioDto implements Serializable {
    private final Long id;
    private final String email;
}
