package com.github.alissonmartineli.beerapi.mapper;

import com.github.alissonmartineli.beerapi.dto.BeerDTO;
import com.github.alissonmartineli.beerapi.entity.Beer;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
