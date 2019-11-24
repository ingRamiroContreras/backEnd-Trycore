package com.trycore.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trycore.prueba.entity.People;
import com.trycore.prueba.repository.PeopleRepository;

@Service
public class PeopleServiceImpl implements PeopleService{
	
	@Autowired
	PeopleRepository peopleRepository;

	@Override
	public List<People> getAll() {
		// TODO Auto-generated method stub
		return peopleRepository.findAll();
	}

	@Override
	public People create(People entity) {
		// TODO Auto-generated method stub
		return peopleRepository.save(entity);
	}

	@Override
	public People update(People entity) {
		// TODO Auto-generated method stub
		return peopleRepository.save(entity);
	}

	@Override
	public void delete(People entity) {
		// TODO Auto-generated method stub
		peopleRepository.delete(entity);
	}

	@Override
	public People getByID(Long id) {
		// TODO Auto-generated method stub
		return peopleRepository.getOne(id);
	}
	
	

}
