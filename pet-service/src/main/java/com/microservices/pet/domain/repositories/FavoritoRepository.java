package com.microservices.pet.domain.repositories;

import com.microservices.pet.domain.models.entities.Favorito;
import com.microservices.pet.domain.repositories.base.GenericCrudRepository;

public interface FavoritoRepository extends GenericCrudRepository<Favorito, Long> {
}
