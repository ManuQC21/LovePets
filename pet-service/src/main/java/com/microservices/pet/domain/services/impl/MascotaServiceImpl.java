package com.microservices.pet.domain.services.impl;

import com.microservices.pet.domain.mappers.MascotaMapper;
import com.microservices.pet.domain.models.dto.MascotaDto;
import com.microservices.pet.domain.models.entities.Mascota;
import com.microservices.pet.domain.repositories.MascotaRepository;
import com.microservices.pet.domain.services.MascotaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MascotaServiceImpl implements MascotaService {

    private MascotaRepository mascotaRepository;

    @Override
    public MascotaDto createMascota(MascotaDto mascotaDto) {
        Mascota mascota = MascotaMapper.INSTANCE.mascotaDtoToMascota(mascotaDto);
        Mascota savedToDb = this.mascotaRepository.save(mascota);
        return MascotaMapper.INSTANCE.mascotaToMascotaDtO(savedToDb);
    }

    @Override
    public List<MascotaDto> getALl() {
        return null;
    }

    @Override
    public MascotaDto getOne(Long id) {
        return null;
    }

    @Override
    public MascotaDto updateMascota(MascotaDto mascotaDto) {
        Mascota mascota = MascotaMapper.INSTANCE.mascotaDtoToMascota(mascotaDto);
        Mascota savedToDb = this.mascotaRepository.save(mascota);
        return MascotaMapper.INSTANCE.mascotaToMascotaDtO(savedToDb);
    }

    @Override
    public Void deleteMascota(Long id) {
        this.mascotaRepository.deleteById(id);
        return null;
    }
}
