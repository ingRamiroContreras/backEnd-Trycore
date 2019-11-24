package com.trycore.prueba.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "peoples", schema = "")
public class People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPeople", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "mass")
	private String mass;
	
	@Column(name = "hair_color")
	private String hair_color;
	
	@Column(name = "skin_color")
	private String skin_color;
	
	@Column(name = "eye_color")
	private String eye_color;
	
	@Column(name = "birth_year")
	private String birth_year;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "homeworld")
	private String homeworld;

	Specie specie;
	
	@ManyToOne(cascade=CascadeType.ALL)  
	public Specie getSpecie() {
		return specie;
	}

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

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getSkin_color() {
		return skin_color;
	}

	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}

	public String getEye_color() {
		return eye_color;
	}

	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public void setSpecie(Specie specie) {
		this.specie = specie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth_year == null) ? 0 : birth_year.hashCode());
		result = prime * result + ((eye_color == null) ? 0 : eye_color.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((hair_color == null) ? 0 : hair_color.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((homeworld == null) ? 0 : homeworld.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mass == null) ? 0 : mass.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((skin_color == null) ? 0 : skin_color.hashCode());
		result = prime * result + ((specie == null) ? 0 : specie.hashCode());
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
		People other = (People) obj;
		if (birth_year == null) {
			if (other.birth_year != null)
				return false;
		} else if (!birth_year.equals(other.birth_year))
			return false;
		if (eye_color == null) {
			if (other.eye_color != null)
				return false;
		} else if (!eye_color.equals(other.eye_color))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hair_color == null) {
			if (other.hair_color != null)
				return false;
		} else if (!hair_color.equals(other.hair_color))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
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
		if (mass == null) {
			if (other.mass != null)
				return false;
		} else if (!mass.equals(other.mass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (skin_color == null) {
			if (other.skin_color != null)
				return false;
		} else if (!skin_color.equals(other.skin_color))
			return false;
		if (specie == null) {
			if (other.specie != null)
				return false;
		} else if (!specie.equals(other.specie))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", height=" + height + ", mass=" + mass + ", hair_color="
				+ hair_color + ", skin_color=" + skin_color + ", eye_color=" + eye_color + ", birth_year=" + birth_year
				+ ", gender=" + gender + ", homeworld=" + homeworld + ", specie=" + specie + "]";
	}

	

}
