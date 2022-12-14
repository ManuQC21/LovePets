package com.microservices.pet.domain.models.dto;

import com.microservices.pet.domain.models.entities.Admin;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Admin} entity
 */
@Data
public class AdminDto implements Serializable {
    private final Long id;
    private final UsuarioDto usuario;
    private final String nombres;
    private final String dni;
}
