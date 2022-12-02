package com.microservices.pet.infrastructure.repositories.jpa;

import com.microservices.pet.domain.models.entities.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaJpaRepository extends JpaRepository<Mascota, Long> {
}
