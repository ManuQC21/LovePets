package com.microservices.pet.application.controllers.impl;

import com.microservices.pet.application.controllers.contracts.MascotaController;
import com.microservices.pet.domain.mappers.MascotaMapper;
import com.microservices.pet.domain.models.dto.MascotaDto;
import com.microservices.pet.domain.models.entities.Mascota;
import com.microservices.pet.domain.services.MascotaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(path = "pets")
public class MascotaControllerImpl implements MascotaController {

    private MascotaService mascotaService;
    @Override
    public ResponseEntity<MascotaDto> create(MascotaDto mascota) {
        MascotaDto savedPet = this.mascotaService.createMascota(mascota);
        ResponseEntity<MascotaDto> response = new ResponseEntity<>(savedPet, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<List<MascotaDto>> getAll() {
        List<MascotaDto> retrievedPets = this.mascotaService.getALl();
        ResponseEntity<List<MascotaDto>> response = new ResponseEntity<>(retrievedPets, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<MascotaDto> getOne(Long id) {
        MascotaDto found = this.mascotaService.getOne(id);
        ResponseEntity<MascotaDto> response = new ResponseEntity<>(found, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<MascotaDto> update(MascotaDto mascota) {
        MascotaDto updated = this.mascotaService.createMascota(mascota);
        ResponseEntity<MascotaDto> response = new ResponseEntity<>(updated, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        this.mascotaService.deleteMascota(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
