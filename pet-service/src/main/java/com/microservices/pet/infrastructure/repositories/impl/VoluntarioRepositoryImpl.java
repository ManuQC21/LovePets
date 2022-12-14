package com.microservices.pet.infrastructure.repositories.impl;

import com.microservices.pet.domain.models.entities.Voluntario;
import com.microservices.pet.domain.repositories.VoluntarioRepository;
import com.microservices.pet.infrastructure.repositories.jpa.VoluntarioJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class VoluntarioRepositoryImpl implements VoluntarioRepository {

    private VoluntarioJpaRepository voluntarioJpaRepository;

    @Override
    public Voluntario save(Voluntario entity) {
        return this.voluntarioJpaRepository.save(entity);
    }

    @Override
    public List<Voluntario> getAll() {
        return this.voluntarioJpaRepository.findAll();
    }

    @Override
    public Voluntario getById(Long id) {
        return this.voluntarioJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.voluntarioJpaRepository.deleteById(id);
    }
}
