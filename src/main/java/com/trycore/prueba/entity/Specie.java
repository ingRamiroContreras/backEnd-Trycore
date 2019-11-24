package com.trycore.prueba.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "species", schema = "")
public class Specie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSpecie", unique = true, nullable = false)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "classification")
	private String classification;

	@Column(name = "designation")
	private String designation;

	@Column(name = "average_height")
	private String average_height;

	@Column(name = "skin_colors")
	private String skin_colors;

	@Column(name = "hair_colors")
	private String hair_colors;

	@Column(name = "eye_colors")
	private String eye_colors;

	@Column(name = "average_lifespan")
	private String average_lifespan;

	@Column(name = "homeworld")
	private String homeworld;

	@Column(name = "language")
	private String language;

	@ManyToOne
	@JoinColumn(name = "planet_id")
	Planet planet;

	@OneToMany(mappedBy="specie")
	Set<People> peoples;

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

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAverage_height() {
		return average_height;
	}

	public void setAverage_height(String average_height) {
		this.average_height = average_height;
	}

	public String getSkin_colors() {
		return skin_colors;
	}

	public void setSkin_colors(String skin_colors) {
		this.skin_colors = skin_colors;
	}

	public String getHair_colors() {
		return hair_colors;
	}

	public void setHair_colors(String hair_colors) {
		this.hair_colors = hair_colors;
	}

	public String getEye_colors() {
		return eye_colors;
	}

	public void setEye_colors(String eye_colors) {
		this.eye_colors = eye_colors;
	}

	public String getAverage_lifespan() {
		return average_lifespan;
	}

	public void setAverage_lifespan(String average_lifespan) {
		this.average_lifespan = average_lifespan;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Planet getPlanet() {
		return planet;
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

	public Set<People> getPeoples() {
		return peoples;
	}

	public void setPeoples(Set<People> peoples) {
		this.peoples = peoples;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((average_height == null) ? 0 : average_height.hashCode());
		result = prime * result + ((average_lifespan == null) ? 0 : average_lifespan.hashCode());
		result = prime * result + ((classification == null) ? 0 : classification.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((eye_colors == null) ? 0 : eye_colors.hashCode());
		result = prime * result + ((hair_colors == null) ? 0 : hair_colors.hashCode());
		result = prime * result + ((homeworld == null) ? 0 : homeworld.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((peoples == null) ? 0 : peoples.hashCode());
		result = prime * result + ((planet == null) ? 0 : planet.hashCode());
		result = prime * result + ((skin_colors == null) ? 0 : skin_colors.hashCode());
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
		Specie other = (Specie) obj;
		if (average_height == null) {
			if (other.average_height != null)
				return false;
		} else if (!average_height.equals(other.average_height))
			return false;
		if (average_lifespan == null) {
			if (other.average_lifespan != null)
				return false;
		} else if (!average_lifespan.equals(other.average_lifespan))
			return false;
		if (classification == null) {
			if (other.classification != null)
				return false;
		} else if (!classification.equals(other.classification))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (eye_colors == null) {
			if (other.eye_colors != null)
				return false;
		} else if (!eye_colors.equals(other.eye_colors))
			return false;
		if (hair_colors == null) {
			if (other.hair_colors != null)
				return false;
		} else if (!hair_colors.equals(other.hair_colors))
			return false;
		if (homeworld == null) {
			if (other.homeworld != null)
				return false;
		} else if (!homeworld.equals(other.homeworld))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (peoples == null) {
			if (other.peoples != null)
				return false;
		} else if (!peoples.equals(other.peoples))
			return false;
		if (planet == null) {
			if (other.planet != null)
				return false;
		} else if (!planet.equals(other.planet))
			return false;
		if (skin_colors == null) {
			if (other.skin_colors != null)
				return false;
		} else if (!skin_colors.equals(other.skin_colors))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Specie [id=" + id + ", name=" + name + ", classification=" + classification + ", designation="
				+ designation + ", average_height=" + average_height + ", skin_colors=" + skin_colors + ", hair_colors="
				+ hair_colors + ", eye_colors=" + eye_colors + ", average_lifespan=" + average_lifespan + ", homeworld="
				+ homeworld + ", language=" + language + ", planet=" + planet + ", peoples=" + peoples + "]";
	}
	
	
	
}
