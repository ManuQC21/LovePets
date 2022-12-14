package com.microservices.pet.infrastructure.repositories.jpa;

import com.microservices.pet.domain.models.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJpaRepository extends JpaRepository<Admin, Long> {
}
