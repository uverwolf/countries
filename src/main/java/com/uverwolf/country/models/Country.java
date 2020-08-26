package com.uverwolf.country.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@SuppressWarnings("unused")
@Entity
@Table(name="countries")
public class Country {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String code;
private String name;
private enum continent{Asia, Europe, NorthAmerica, Africa, Oceania, Antarctica, SouthAmerica};
private String region;
private Integer surface_area;
private Integer indep_year;
private Integer population;
private Integer life_expectancy;
private Integer gnp;
private Integer gnp_old;
private String local_name;
private String government_form;
private String head_of_state;
private Integer capital;
private String code2;
@OneToMany(mappedBy="country", fetch = FetchType.LAZY)
private List<City> cities;

@OneToMany(mappedBy="country", fetch = FetchType.LAZY)
private List<Language> languages;

public Country() {
	
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}

public Integer getSurface_area() {
	return surface_area;
}

public void setSurface_area(Integer surface_area) {
	this.surface_area = surface_area;
}

public Integer getIndep_year() {
	return indep_year;
}

public void setIndep_year(Integer indep_year) {
	this.indep_year = indep_year;
}

public Integer getPopulation() {
	return population;
}

public void setPopulation(int population) {
	this.population = population;
}

public Integer getLife_expectancy() {
	return life_expectancy;
}

public void setLife_expectancy(Integer life_expectancy) {
	this.life_expectancy = life_expectancy;
}

public Integer getGnp() {
	return gnp;
}

public void setGnp(Integer gnp) {
	this.gnp = gnp;
}

public Integer getGnp_old() {
	return gnp_old;
}

public void setGnp_old(Integer gnp_old) {
	this.gnp_old = gnp_old;
}

public String getLocal_name() {
	return local_name;
}

public void setLocal_name(String local_name) {
	this.local_name = local_name;
}

public String getGovernment_form() {
	return government_form;
}

public void setGovernment_form(String government_form) {
	this.government_form = government_form;
}

public String getHead_of_state() {
	return head_of_state;
}

public void setHead_of_state(String head_of_state) {
	this.head_of_state = head_of_state;
}

public Integer getCapital() {
	return capital;
}

public void setCapital(Integer capital) {
	this.capital = capital;
}

public String getCode2() {
	return code2;
}

public void setCode2(String code2) {
	this.code2 = code2;
}

public List<City> getCities() {
	return cities;
}

public void setCities(List<City> cities) {
	this.cities = cities;
}

public List<Language> getLanguages() {
	return languages;
}

public void setLanguages(List<Language> languages) {
	this.languages = languages;
}




}
