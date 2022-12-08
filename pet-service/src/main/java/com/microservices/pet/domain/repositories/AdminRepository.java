package com.microservices.pet.domain.repositories;

import com.microservices.pet.domain.models.entities.Admin;
import com.microservices.pet.domain.repositories.base.GenericCrudRepository;

public interface AdminRepository extends GenericCrudRepository<Admin, Long> {
    Admin getByUserId(Long id);
}
