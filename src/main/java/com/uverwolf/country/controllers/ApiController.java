package com.uverwolf.country.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uverwolf.country.services.CountryService;

@RestController
public class ApiController {
	private final CountryService servicios;
	public ApiController(CountryService serv) {
		this.servicios=serv;
	}
	@GetMapping("/")
	public List<Object[]> index(){
		return servicios.ej8();
	}
}
