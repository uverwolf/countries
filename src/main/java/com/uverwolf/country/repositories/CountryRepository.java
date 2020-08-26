package com.uverwolf.country.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uverwolf.country.models.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
	 
	@Query("SELECT d.name From Country d")
	    List<String> findAllCountryName();
	//Ejercicio 1
	@Query("Select c.name,l.language,l.percentage FROM Country c JOIN c.languages l where l.language='Slovene' order by l.percentage DESC")
	List<Object[]>joinCountriesAndLanguages();
	
	//Ejercicio 2
	@Query("select c.name, count(*) from Country c JOIN c.cities   group by c.name")
	List<Object[]>joinCountriesAndCities();
	//Ejercicio 3
	@Query("select c.name,ct.name,ct.population from Country c JOIN c.cities ct where c.name='Mexico' and ct.population>500000 order by ct.population DESC")
	List<Object[]>joinCountiresAndCitiesPopulation();
	//Ejercicio 4
	@Query("select c.name,l.language,l.percentage from Country c JOIN c.languages l where l.percentage>89")
	List<Object[]>joinCountriesAndLenguagesP();
	//Ejercicio 5
	@Query("select c.name from Country c where c.surface_area<501 and c.population>100000")
	List<Object[]>findCountriesValues();
	//ejercicio 6
	@Query("select c.name from Country c where c.government_form ='Constitutional Monarchy' and c.surface_area>200 and c.life_expectancy>75")
	List<Object[]>findMonarchy();
	//ejercicio 7
	@Query("select c.name, ct.name,ct.district,ct.population FROM Country c JOIN c.cities ct where ct.district='Buenos Aires' and ct.population>500000")
	List<Object[]>findBuenoAires();
	//ejercicio 8
	@Query("select c.region,count(c.region) as paises from Country c group by c.region order by paises desc")
	List<Object[]>findRegion();
}
