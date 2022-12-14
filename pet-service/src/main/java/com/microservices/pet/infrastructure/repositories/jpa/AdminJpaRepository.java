package com.microservices.pet.infrastructure.repositories.jpa;

import com.microservices.pet.domain.models.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJpaRepository extends JpaRepository<Admin, Long> {
<<<<<<< HEAD
=======
    Admin getByUsuarioId(Long id);
>>>>>>> 203310abeb0059f3056c70490ce07963e6bd253c
}
