package com.microservices.pet.domain.services.impl;

import com.microservices.pet.domain.models.entities.Solicitud;
import com.microservices.pet.domain.services.SolicitudService;
import com.microservices.pet.infrastructure.repositories.impl.SolicitudRepositoryImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SolicitudServiceImpl implements SolicitudService {

    private SolicitudRepositoryImpl solicitudRepository;

    @Override
    public Solicitud createSolicitud(Solicitud solicitud) {
        return this.solicitudRepository.save(solicitud);
    }

    @Override
    public List<Solicitud> getALl() {
        return this.solicitudRepository.getAll();
    }

    @Override
    public List<Solicitud> getAllPendings() {
        return this.solicitudRepository.getAllPendings();
    }

    @Override
    public Solicitud getOne(Long id) {
        return this.solicitudRepository.getById(id);
    }

    @Override
    public Void deleteSolicitud(Long id) {
        this.solicitudRepository.deleteById(id);
        return null;
    }
}
