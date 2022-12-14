package com.microservices.pet.application.controllers.impl;

import com.microservices.pet.application.controllers.contracts.SolicitudController;
import com.microservices.pet.domain.models.entities.Solicitud;
import com.microservices.pet.domain.services.SolicitudService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "requests")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SolicitudControllerImpl implements SolicitudController {

    private SolicitudService solicitudService;
    @Override
    public ResponseEntity<Solicitud> create(Solicitud solicitud) {
        Solicitud saved = this.solicitudService.createSolicitud(solicitud);
        ResponseEntity<Solicitud> response = new ResponseEntity(saved, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<List<Solicitud>> getAll() {
        List<Solicitud> retrieved = this.solicitudService.getALl();
        ResponseEntity<List<Solicitud>> response = new ResponseEntity(retrieved, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<List<Solicitud>> getAllPendings() {
        List<Solicitud> retrieved = this.solicitudService.getAllPendings();
        ResponseEntity<List<Solicitud>> response = new ResponseEntity(retrieved, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<Solicitud> getOne(Long id) {
        Solicitud retrieved = this.solicitudService.getOne(id);
        ResponseEntity<Solicitud> response = new ResponseEntity(retrieved, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<Solicitud> update(Solicitud solicitud) {
        Solicitud updated = this.solicitudService.createSolicitud(solicitud);
        ResponseEntity<Solicitud> response = new ResponseEntity(updated, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        this.solicitudService.deleteSolicitud(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Solicitud> declinar(Long id) {
        return new ResponseEntity<>(this.solicitudService.declinar(id), HttpStatus.OK);
    }
}
