package com.microservices.pet.domain.models.dto;

import com.microservices.pet.domain.models.entities.Adoptante;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Adoptante} entity
 */
@Data
public class AdoptanteDto implements Serializable {
    private final Long id;
    private final UsuarioDto usuario;
    private final LocalDate fechaRegistro;
}
