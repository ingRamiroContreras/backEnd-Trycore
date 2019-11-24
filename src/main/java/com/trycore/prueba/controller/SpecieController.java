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

import com.trycore.prueba.entity.Specie;
import com.trycore.prueba.service.SpecieService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class SpecieController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	SpecieService SpecieService;


	@GetMapping("/Species")
	public List<Specie> retrieveAllSpecies() {
		return SpecieService.getAll();
	}

	@GetMapping("/Species/{id}")
	public ResponseEntity<Specie> retrieveSpecie(@PathVariable long id) {
		Specie Specie = SpecieService.getByID(id);

		return new ResponseEntity<Specie>(Specie, HttpStatus.OK);

	}

	@DeleteMapping("/Species/{id}")
	public void deleteSpecie(@PathVariable long id) {
		Specie Specie = SpecieService.getByID(id);
		if (Specie != null) {
			SpecieService.delete(Specie);

		}
	}

	@PostMapping("/Species")
	public ResponseEntity<Specie> createSpecie(@RequestBody Specie Specie) {
		Specie savedSpecie = SpecieService.create(Specie);

		return new ResponseEntity<Specie>(savedSpecie, HttpStatus.OK);

	}

	@PutMapping("/Species/{id}")
	public ResponseEntity<Object> updateSpecie(@RequestBody Specie Specie, @PathVariable long id) {

		Specie SpecieOptional = SpecieService.getByID(id);

		if (SpecieOptional == null)
			return ResponseEntity.notFound().build();

		SpecieService.create(Specie);

		return ResponseEntity.noContent().build();
	}

}

