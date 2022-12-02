package com.microservices.pet.domain.services;

import com.microservices.pet.domain.models.entities.Solicitud;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SolicitudService {
    Solicitud createSolicitud(Solicitud solicitud);
    List<Solicitud> getALl();
    List<Solicitud> getAllPendings();
    Solicitud getOne(Long id);

    Void deleteSolicitud(Long id);

    Solicitud declinar(Long id);
}
