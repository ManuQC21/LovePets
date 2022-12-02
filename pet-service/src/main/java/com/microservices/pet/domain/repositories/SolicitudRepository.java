package com.microservices.pet.domain.repositories;

import com.microservices.pet.domain.models.entities.Solicitud;
import com.microservices.pet.domain.repositories.base.GenericCrudRepository;

import java.util.List;

public interface SolicitudRepository extends GenericCrudRepository<Solicitud, Long> {
    List<Solicitud> getAllPendings();
}
