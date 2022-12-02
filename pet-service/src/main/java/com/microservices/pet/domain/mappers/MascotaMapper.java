package com.microservices.pet.domain.mappers;

import com.microservices.pet.domain.models.dto.MascotaDto;
import com.microservices.pet.domain.models.entities.Mascota;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring"
)
public interface MascotaMapper {
    MascotaMapper INSTANCE = Mappers.getMapper(MascotaMapper.class);

    MascotaDto mascotaToMascotaDtO(Mascota mascota);
    Mascota mascotaDtoToMascota(MascotaDto mascotaDto);
}
