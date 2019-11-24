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

import com.trycore.prueba.entity.Planet;
import com.trycore.prueba.service.PlanetService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class PlanetController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	PlanetService PlanetService;


	@GetMapping("/Planets")
	public List<Planet> retrieveAllPlanets() {
		return PlanetService.getAll();
	}

	@GetMapping("/Planets/{id}")
	public ResponseEntity<Planet> retrievePlanet(@PathVariable long id) {
		Planet planet = PlanetService.getByID(id);

		return new ResponseEntity<Planet>(planet, HttpStatus.OK);

	}

	@DeleteMapping("/Planets/{id}")
	public void deletePlanet(@PathVariable long id) {
		Planet Planet = PlanetService.getByID(id);
		if (Planet != null) {
			PlanetService.delete(Planet);

		}
	}

	@PostMapping("/Planets")
	public ResponseEntity<Planet> createPlanet(@RequestBody Planet Planet) {
		Planet savedPlanet = PlanetService.create(Planet);

		return new ResponseEntity<Planet>(savedPlanet, HttpStatus.OK);

	}

	@PutMapping("/Planets/{id}")
	public ResponseEntity<Object> updatePlanet(@RequestBody Planet Planet, @PathVariable long id) {

		Planet PlanetOptional = PlanetService.getByID(id);

		if (PlanetOptional == null)
			return ResponseEntity.notFound().build();

		PlanetService.create(Planet);

		return ResponseEntity.noContent().build();
	}

}

