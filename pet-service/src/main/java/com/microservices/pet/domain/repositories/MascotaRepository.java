package com.microservices.pet.domain.repositories;

import com.microservices.pet.domain.models.entities.Mascota;
import com.microservices.pet.domain.repositories.base.GenericCrudRepository;

public interface MascotaRepository extends GenericCrudRepository<Mascota, Long> {
}
