package com.github.alissonmartineli.beerapi.repository;

import java.util.Optional;

import com.github.alissonmartineli.beerapi.entity.Beer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
