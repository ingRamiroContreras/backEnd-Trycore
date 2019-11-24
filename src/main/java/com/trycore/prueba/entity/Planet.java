package com.trycore.prueba.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "planets", schema = "")
public class Planet implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPlanet", unique = true, nullable = false)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "rotation_period")
	private String rotation_period;

	@Column(name = "orbital_period")
	private String orbital_period;

	@Column(name = "diameter")
	private String diameter;

	@Column(name = "climate")
	private String climate;

	@Column(name = "gravity")
	private String gravity;

	@Column(name = "terrain")
	private String terrain;

	@Column(name = "surface_water")
	private String surface_water;

	@Column(name = "population")
	private String population;

	@OneToMany(mappedBy = "planet")
	Set<Specie> species;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRotation_period() {
		return rotation_period;
	}

	public void setRotation_period(String rotation_period) {
		this.rotation_period = rotation_period;
	}

	public String getOrbital_period() {
		return orbital_period;
	}

	public void setOrbital_period(String orbital_period) {
		this.orbital_period = orbital_period;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getSurface_water() {
		return surface_water;
	}

	public void setSurface_water(String surface_water) {
		this.surface_water = surface_water;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public Set<Specie> getSpecies() {
		return species;
	}

	public void setSpecies(Set<Specie> species) {
		this.species = species;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((climate == null) ? 0 : climate.hashCode());
		result = prime * result + ((diameter == null) ? 0 : diameter.hashCode());
		result = prime * result + ((gravity == null) ? 0 : gravity.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orbital_period == null) ? 0 : orbital_period.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((rotation_period == null) ? 0 : rotation_period.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		result = prime * result + ((surface_water == null) ? 0 : surface_water.hashCode());
		result = prime * result + ((terrain == null) ? 0 : terrain.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		if (climate == null) {
			if (other.climate != null)
				return false;
		} else if (!climate.equals(other.climate))
			return false;
		if (diameter == null) {
			if (other.diameter != null)
				return false;
		} else if (!diameter.equals(other.diameter))
			return false;
		if (gravity == null) {
			if (other.gravity != null)
				return false;
		} else if (!gravity.equals(other.gravity))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orbital_period == null) {
			if (other.orbital_period != null)
				return false;
		} else if (!orbital_period.equals(other.orbital_period))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (rotation_period == null) {
			if (other.rotation_period != null)
				return false;
		} else if (!rotation_period.equals(other.rotation_period))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		if (surface_water == null) {
			if (other.surface_water != null)
				return false;
		} else if (!surface_water.equals(other.surface_water))
			return false;
		if (terrain == null) {
			if (other.terrain != null)
				return false;
		} else if (!terrain.equals(other.terrain))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", rotation_period=" + rotation_period + ", orbital_period="
				+ orbital_period + ", diameter=" + diameter + ", climate=" + climate + ", gravity=" + gravity
				+ ", terrain=" + terrain + ", surface_water=" + surface_water + ", population=" + population
				+ ", species=" + species + "]";
	}

	

}
