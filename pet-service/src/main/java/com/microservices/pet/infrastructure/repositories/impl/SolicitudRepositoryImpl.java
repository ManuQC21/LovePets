package com.microservices.pet.infrastructure.repositories.impl;

import com.microservices.pet.domain.models.entities.Solicitud;
import com.microservices.pet.domain.repositories.SolicitudRepository;
import com.microservices.pet.infrastructure.repositories.jpa.SolicitudJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class SolicitudRepositoryImpl implements SolicitudRepository {

    private SolicitudJpaRepository solicitudJpaRepository;

    @Override
    public Solicitud save(Solicitud entity) {
        return this.solicitudJpaRepository.save(entity);
    }

    @Override
    public List<Solicitud> getAll() {
        return this.solicitudJpaRepository.findAll();
    }

    @Override
    public Solicitud getById(Long id) {
        return this.solicitudJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.solicitudJpaRepository.deleteById(id);
    }

    @Override
    public List<Solicitud> getAllPendings() {
        return this.solicitudJpaRepository.getSolicitudByAceptada(false);
    }
}
