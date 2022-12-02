package com.microservices.pet.application.controllers.contracts;

import com.microservices.pet.domain.models.dto.MascotaDto;
import com.microservices.pet.domain.models.entities.Mascota;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MascotaController {

    @PostMapping
    ResponseEntity<MascotaDto> create(@RequestBody MascotaDto mascota);

    @GetMapping
    ResponseEntity<List<MascotaDto>> getAll();

    @GetMapping(path = "/{id}")
    ResponseEntity<MascotaDto> getOne(@PathVariable("id") Long id);

    @PutMapping()
    ResponseEntity<MascotaDto> update(@RequestBody MascotaDto mascota);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

}
