package com.trycore.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trycore.prueba.entity.Specie;

@Repository
public interface SpecieRepository extends JpaRepository<Specie, Long>{

}
