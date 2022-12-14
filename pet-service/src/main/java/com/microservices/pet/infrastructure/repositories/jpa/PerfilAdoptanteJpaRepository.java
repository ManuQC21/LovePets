package com.microservices.pet.infrastructure.repositories.jpa;

import com.microservices.pet.domain.models.entities.PerfilAdoptante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilAdoptanteJpaRepository extends JpaRepository<PerfilAdoptante, Long> {
    PerfilAdoptante getPerfilAdoptanteByAdoptanteId(Long id);
}
