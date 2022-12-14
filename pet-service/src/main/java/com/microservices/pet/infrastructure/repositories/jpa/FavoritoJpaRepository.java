package com.microservices.pet.infrastructure.repositories.jpa;

import com.microservices.pet.domain.models.entities.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoritoJpaRepository extends JpaRepository<Favorito, Long> {
    List<Favorito> getFavoritosByAdoptante(Long id);
}
