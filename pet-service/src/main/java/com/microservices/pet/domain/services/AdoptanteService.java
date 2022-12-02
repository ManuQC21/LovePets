package com.microservices.pet.domain.services;

import com.microservices.pet.domain.models.dto.AdoptanteDto;
import com.microservices.pet.domain.models.dto.FavoritoDto;
import com.microservices.pet.domain.models.entities.PerfilAdoptante;

import java.util.List;

public interface AdoptanteService {

    List<AdoptanteDto> getAllAdoptantes();
    AdoptanteDto getAdoptanteById(Long id);
    FavoritoDto createFavorito(FavoritoDto favoritoDto);
    List<FavoritoDto> getFavoritosByAdoptanteId(Long id);
    void deleteFavoritoById(Long id);

    PerfilAdoptante getPerfilByAdoptante(Long id);
    PerfilAdoptante updatePerfil(PerfilAdoptante perfilAdoptante);

}
