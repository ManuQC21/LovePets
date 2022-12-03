package com.microservices.pet.domain.models.dto;

import com.microservices.pet.domain.models.entities.Favorito;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Favorito} entity
 */
@Data
public class FavoritoDto implements Serializable {
    private final Long id;
    private final MascotaDto mascota;
    private final AdoptanteDto adoptante;
}
