package com.microservices.pet.infrastructure.repositories.impl;

import com.microservices.pet.domain.models.entities.Admin;
import com.microservices.pet.domain.repositories.AdminRepository;
import com.microservices.pet.infrastructure.repositories.jpa.AdminJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class AdminRepositoryImpl implements AdminRepository {

    private AdminJpaRepository adminJpaRepository;

    @Override
    public Admin save(Admin entity) {
        return this.adminJpaRepository.save(entity);
    }

    @Override
    public List<Admin> getAll() {
        return this.adminJpaRepository.findAll();
    }

    @Override
    public Admin getById(Long id) {
        return this.adminJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO HAY XD " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.adminJpaRepository.deleteById(id);
    }

    @Override
    public Admin getByUserId(Long id) {
        return this.adminJpaRepository.getByUsuarioId(id);
    }
}
