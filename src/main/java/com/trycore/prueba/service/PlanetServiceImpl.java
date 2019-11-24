package com.trycore.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trycore.prueba.entity.Planet;
import com.trycore.prueba.repository.PlanetRepository;

@Service
public class PlanetServiceImpl implements PlanetService{
	
	@Autowired
	PlanetRepository PlanetRepository;

	@Override
	public List<Planet> getAll() {
		// TODO Auto-generated method stub
		return PlanetRepository.findAll();
	}

	@Override
	public Planet create(Planet entity) {
		// TODO Auto-generated method stub
		return PlanetRepository.save(entity);
	}

	@Override
	public Planet update(Planet entity) {
		// TODO Auto-generated method stub
		return PlanetRepository.save(entity);
	}

	@Override
	public void delete(Planet entity) {
		// TODO Auto-generated method stub
		PlanetRepository.delete(entity);
	}

	@Override
	public Planet getByID(Long id) {
		// TODO Auto-generated method stub
		return PlanetRepository.getOne(id);
	}
	
	

}
