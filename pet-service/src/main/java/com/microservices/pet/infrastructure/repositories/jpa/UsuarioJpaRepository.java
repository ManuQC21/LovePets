package com.microservices.pet.infrastructure.repositories.jpa;

import com.microservices.pet.domain.models.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long> {
}
