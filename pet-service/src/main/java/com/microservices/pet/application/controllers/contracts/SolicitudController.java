package com.microservices.pet.application.controllers.contracts;

import com.microservices.pet.domain.models.entities.Solicitud;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface SolicitudController {

    @PostMapping
    ResponseEntity<Solicitud> create(@RequestBody Solicitud solicitud);

    @GetMapping
    ResponseEntity<List<Solicitud>> getAll();

    @GetMapping(path = "/pendings")
    ResponseEntity<List<Solicitud>> getAllPendings();

    @GetMapping(path = "/{id}")
    ResponseEntity<Solicitud> getOne(@PathVariable("id") Long id);

    @PutMapping()
    ResponseEntity<Solicitud> update(@RequestBody Solicitud mascota);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

}
