package com.microservices.pet.domain.mappers;

import com.microservices.pet.domain.models.dto.FavoritoDto;
import com.microservices.pet.domain.models.entities.Favorito;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FavoritoMapper {

    FavoritoMapper INSTANCE = Mappers.getMapper(FavoritoMapper.class);

    FavoritoDto favoritoToFavoritoDto(Favorito favorito);
    Favorito favoritoDtoToFavorito(FavoritoDto favoritoDto);
}
