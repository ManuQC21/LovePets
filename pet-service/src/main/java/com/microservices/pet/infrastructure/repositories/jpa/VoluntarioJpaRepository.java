package com.microservices.pet.infrastructure.repositories.jpa;

import com.microservices.pet.domain.models.entities.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoluntarioJpaRepository extends JpaRepository<Voluntario, Long> {
}
