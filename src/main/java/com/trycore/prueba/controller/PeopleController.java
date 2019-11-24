package com.trycore.prueba.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trycore.prueba.entity.People;
import com.trycore.prueba.service.PeopleService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class PeopleController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	PeopleService PeopleService;


	@GetMapping("/Peoples")
	public List<People> retrieveAllPeoples() {
		return PeopleService.getAll();
	}

	@GetMapping("/Peoples/{id}")
	public ResponseEntity<People> retrievePeople(@PathVariable long id) {
		People People = PeopleService.getByID(id);

		return new ResponseEntity<People>(People, HttpStatus.OK);

	}

	@DeleteMapping("/Peoples/{id}")
	public void deletePeople(@PathVariable long id) {
		People People = PeopleService.getByID(id);
		if (People != null) {
			PeopleService.delete(People);

		}
	}

	@PostMapping("/Peoples")
	public ResponseEntity<People> createPeople(@RequestBody People People) {
		People savedPeople = PeopleService.create(People);

		return new ResponseEntity<People>(savedPeople, HttpStatus.OK);

	}

	@PutMapping("/Peoples/{id}")
	public ResponseEntity<Object> updatePeople(@RequestBody People People, @PathVariable long id) {

		People PeopleOptional = PeopleService.getByID(id);

		if (PeopleOptional == null)
			return ResponseEntity.notFound().build();

		PeopleService.create(People);

		return ResponseEntity.noContent().build();
	}

}

