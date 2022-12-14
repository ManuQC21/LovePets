package com.microservices.pet.infrastructure.repositories.impl;

import com.microservices.pet.domain.models.entities.Favorito;
import com.microservices.pet.domain.repositories.FavoritoRepository;
import com.microservices.pet.infrastructure.repositories.jpa.FavoritoJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class FavoritoRepositoryImpl implements FavoritoRepository {

    FavoritoJpaRepository favoritoJpaRepository;

    @Override
    public Favorito save(Favorito entity) {
        return this.favoritoJpaRepository.save(entity);
    }

    @Override
    public List<Favorito> getAll() {
        return this.favoritoJpaRepository.findAll();
    }

    @Override
    public Favorito getById(Long id) {
        return this.favoritoJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("D: " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.favoritoJpaRepository.deleteById(id);
    }
}
