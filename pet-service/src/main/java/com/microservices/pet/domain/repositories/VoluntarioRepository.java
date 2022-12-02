package com.microservices.pet.domain.repositories;

import com.microservices.pet.domain.models.entities.Voluntario;
import com.microservices.pet.domain.repositories.base.GenericCrudRepository;

public interface VoluntarioRepository extends GenericCrudRepository<Voluntario, Long> {
}
