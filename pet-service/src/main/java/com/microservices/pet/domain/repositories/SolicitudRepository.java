package com.microservices.pet.domain.repositories;

import com.microservices.pet.domain.models.entities.Solicitud;
import com.microservices.pet.domain.repositories.base.GenericCrudRepository;

public interface SolicitudRepository extends GenericCrudRepository<Solicitud, Long> {
}
