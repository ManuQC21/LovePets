package com.microservices.pet.infrastructure.repositories.jpa;


import com.microservices.pet.domain.models.entities.Adoptante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdoptanteJpaRepository extends JpaRepository<Adoptante, Long> {
    Adoptante getByUsuarioId(Long id);
}
