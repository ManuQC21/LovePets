package com.microservices.pet.infrastructure.repositories.impl;

import com.microservices.pet.domain.models.entities.PerfilAdoptante;
import com.microservices.pet.domain.repositories.PerfilAdoptanteRepository;
import com.microservices.pet.infrastructure.repositories.jpa.PerfilAdoptanteJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class PerfilAdoptanteRepositoryImpl implements PerfilAdoptanteRepository {

    PerfilAdoptanteJpaRepository perfilAdoptanteJpaRepository;


    @Override
    public PerfilAdoptante save(PerfilAdoptante entity) {
        return this.perfilAdoptanteJpaRepository.save(entity);
    }

    @Override
    public List<PerfilAdoptante> getAll() {
        return this.perfilAdoptanteJpaRepository.findAll();
    }

    @Override
    public PerfilAdoptante getById(Long id) {
        return this.perfilAdoptanteJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.perfilAdoptanteJpaRepository.deleteById(id);
    }

    @Override
    public PerfilAdoptante getByAdoptanteId(Long id) {
        return this.perfilAdoptanteJpaRepository.getPerfilAdoptanteByAdoptanteId(id);
    }
}
