package com.microservices.pet.application.controllers.impl;

import com.microservices.pet.application.controllers.contracts.AdoptanteController;
import com.microservices.pet.domain.models.dto.AdoptanteDto;
import com.microservices.pet.domain.models.dto.FavoritoDto;
import com.microservices.pet.domain.models.entities.Favorito;
import com.microservices.pet.domain.models.entities.PerfilAdoptante;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("adoptante")
public class AdoptanteControllerImpl implements AdoptanteController {
    @Override
    public ResponseEntity<List<AdoptanteDto>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<AdoptanteDto> getOne(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<PerfilAdoptante> createPerfil(PerfilAdoptante perfilAdoptante) {
        return null;
    }

    @Override
    public ResponseEntity<PerfilAdoptante> getPerfil(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<PerfilAdoptante> updatePerfil(PerfilAdoptante perfilAdoptante) {
        return null;
    }

    @Override
    public ResponseEntity<FavoritoDto> createFavorito(Favorito favorito) {
        return null;
    }

    @Override
    public ResponseEntity<List<FavoritoDto>> getFavoritosByAdoptanteId(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<FavoritoDto>> deleteFavorito(Long id) {
        return null;
    }
}
