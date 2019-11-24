package com.trycore.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trycore.prueba.entity.Specie;
import com.trycore.prueba.repository.SpecieRepository;

@Service
public class SpecieServiceImpl implements SpecieService{
	
	@Autowired
	SpecieRepository SpecieRepository;

	@Override
	public List<Specie> getAll() {
		// TODO Auto-generated method stub
		return SpecieRepository.findAll();
	}

	@Override
	public Specie create(Specie entity) {
		// TODO Auto-generated method stub
		return SpecieRepository.save(entity);
	}

	@Override
	public Specie update(Specie entity) {
		// TODO Auto-generated method stub
		return SpecieRepository.save(entity);
	}

	@Override
	public void delete(Specie entity) {
		// TODO Auto-generated method stub
		SpecieRepository.delete(entity);
	}

	@Override
	public Specie getByID(Long id) {
		// TODO Auto-generated method stub
		return SpecieRepository.getOne(id);
	}
	
	

}
