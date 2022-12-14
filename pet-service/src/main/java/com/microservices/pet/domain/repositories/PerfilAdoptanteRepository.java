package com.microservices.pet.domain.repositories;

import com.microservices.pet.domain.models.entities.PerfilAdoptante;
import com.microservices.pet.domain.repositories.base.GenericCrudRepository;

public interface PerfilAdoptanteRepository extends GenericCrudRepository<PerfilAdoptante, Long> {
    PerfilAdoptante getByAdoptanteId(Long id);
}
