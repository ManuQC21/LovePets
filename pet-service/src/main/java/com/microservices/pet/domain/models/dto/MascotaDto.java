package com.microservices.pet.domain.models.dto;

import com.microservices.pet.domain.models.entities.Mascota;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Mascota} entity
 */
@Data
public class MascotaDto implements Serializable {
    private Long id;
    private String nombres;
    private String raza;
    private String tamanio;
    private Boolean adoptada;
}
