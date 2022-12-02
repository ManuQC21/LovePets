package com.microservices.pet.domain.services;

import com.microservices.pet.domain.models.dto.MascotaDto;

import java.util.List;

public interface MascotaService {
    MascotaDto createMascota(MascotaDto mascotaDto);
    List<MascotaDto> getALl();
    MascotaDto getOne(Long id);
    MascotaDto updateMascota(MascotaDto mascotaDto);
    Void deleteMascota(Long id);
}
