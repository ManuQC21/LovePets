package com.microservices.pet.domain.services.impl;

import com.microservices.pet.domain.models.dto.AdoptanteDto;
import com.microservices.pet.domain.models.dto.FavoritoDto;
import com.microservices.pet.domain.models.entities.PerfilAdoptante;
import com.microservices.pet.domain.repositories.AdoptanteRepository;
import com.microservices.pet.domain.repositories.FavoritoRepository;
import com.microservices.pet.domain.repositories.PerfilAdoptanteRepository;
import com.microservices.pet.domain.services.AdoptanteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdoptanteServiceImpl implements AdoptanteService {

    private AdoptanteRepository adoptanteRepository;
    private PerfilAdoptanteRepository perfilAdoptanteRepository;
    private FavoritoRepository favoritoRepository;


    @Override
    public List<AdoptanteDto> getAllAdoptantes() {


        return null;
    }

    @Override
    public AdoptanteDto getAdoptanteById(Long id) {
        return null;
    }

    @Override
    public FavoritoDto createFavorito(FavoritoDto favoritoDto) {
        FavoritoDto tosave = favoritoDto;
//        Favorito savedToDb = this.favoritoRepository.save(t);
        return null;
    }

    @Override
    public List<FavoritoDto> getFavoritosByAdoptanteId(Long id) {
        return null;
    }

    @Override
    public void deleteFavoritoById(Long id) {

    }

    @Override
    public PerfilAdoptante getPerfilByAdoptante(Long id) {
        return this.perfilAdoptanteRepository.getByAdoptanteId(id);
    }

    @Override
    public PerfilAdoptante updatePerfil(PerfilAdoptante perfilAdoptante) {
        return this.perfilAdoptanteRepository.save(perfilAdoptante);
    }
}
