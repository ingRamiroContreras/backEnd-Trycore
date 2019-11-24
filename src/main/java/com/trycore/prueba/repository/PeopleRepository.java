package com.trycore.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trycore.prueba.entity.People;

@Repository
public interface PeopleRepository extends  JpaRepository<People, Long>{

}
