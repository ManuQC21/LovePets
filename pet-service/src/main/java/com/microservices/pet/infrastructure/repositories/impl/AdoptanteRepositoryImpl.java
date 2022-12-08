package com.microservices.pet.infrastructure.repositories.impl;

import com.microservices.pet.domain.models.entities.Adoptante;
import com.microservices.pet.domain.repositories.AdoptanteRepository;
import com.microservices.pet.infrastructure.repositories.jpa.AdoptanteJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class AdoptanteRepositoryImpl implements AdoptanteRepository {

    private AdoptanteJpaRepository adoptanteJpaRepository;

    @Override
    public Adoptante save(Adoptante entity) {
        return this.adoptanteJpaRepository.save(entity);
    }

    @Override
    public List<Adoptante> getAll() {
        return this.adoptanteJpaRepository.findAll();
    }

    @Override
    public Adoptante getById(Long id) {
        return this.adoptanteJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("OTRA VEZ " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.adoptanteJpaRepository.deleteById(id);
    }

    @Override
    public Adoptante getByUserId(Long id) {
        return this.adoptanteJpaRepository.getByUsuarioId(id);
    }
}
