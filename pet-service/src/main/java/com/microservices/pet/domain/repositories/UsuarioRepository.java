package com.microservices.pet.domain.repositories;

import com.microservices.pet.domain.models.entities.Usuario;
import com.microservices.pet.domain.repositories.base.GenericCrudRepository;

public interface UsuarioRepository extends GenericCrudRepository<Usuario, Long> {
}
