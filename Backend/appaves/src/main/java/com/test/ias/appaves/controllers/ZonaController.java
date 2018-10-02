package com.test.ias.appaves.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.ias.appaves.entity.Zona;
import com.test.ias.appaves.services.IZonaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/app")
public class ZonaController {
	
	
	@Autowired
	private IZonaService zonaService;
	
	
	@GetMapping("/zonas")
	public List<Zona> List(){
		return zonaService.findAll();
	}

}
