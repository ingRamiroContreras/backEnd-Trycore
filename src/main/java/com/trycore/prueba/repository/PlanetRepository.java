package com.trycore.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trycore.prueba.entity.Planet;

@Repository
public interface PlanetRepository extends  JpaRepository<Planet, Long> {

}
