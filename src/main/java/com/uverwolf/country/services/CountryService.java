package com.uverwolf.country.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uverwolf.country.repositories.CountryRepository;

@Service
public class CountryService {
	private final CountryRepository servCountry;
	public CountryService(CountryRepository serv) {
		this.servCountry=serv;
	}
	
	public List<String> returnCountry(){
		return servCountry.findAllCountryName();
	}
	
	public List<Object[]> ej1(){
		return servCountry.joinCountriesAndLanguages();
	}
	public List<Object[]> ej2(){
		return servCountry.joinCountriesAndCities();
	}

	public List<Object[]> ej3(){
		return servCountry.joinCountiresAndCitiesPopulation();
	}
	public List<Object[]> ej4(){
		return servCountry.joinCountriesAndLenguagesP();
	}
	public List<Object[]> ej5(){
		return servCountry.findCountriesValues();
	}
	public List<Object[]> ej6(){
		return servCountry.findMonarchy();
	}
	public List<Object[]> ej7(){
		return servCountry.findBuenoAires();
	}
	public List<Object[]> ej8(){
		return servCountry.findRegion();
	}
}
