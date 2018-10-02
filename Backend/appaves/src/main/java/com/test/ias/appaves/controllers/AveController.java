package com.test.ias.appaves.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.ias.appaves.entity.Ave;
import com.test.ias.appaves.services.IAveService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class AveController {
	
	@Autowired
	private IAveService aveService;
	
	
	@GetMapping("/aves")
	public List<Ave> index(){
		return aveService.findAll();
	}

	@GetMapping("/aves/{id}")
	public Ave showByid(@PathVariable String id) {
		return aveService.findById(id);
	}
	
	@PostMapping("/aves")
	@ResponseStatus(HttpStatus.CREATED)//201
	public Ave create(@RequestBody Ave ave) {
		return aveService.save(ave);
	}
	
	@PutMapping("/aves/{id}")
	@ResponseStatus(HttpStatus.CREATED)//201
	public Ave update(@RequestBody Ave ave, @PathVariable String id) {
		Ave thisAve = aveService.findById(id);
		thisAve.setNombreCientifico(ave.getNombreCientifico());
		thisAve.setNombreComun(ave.getNombreComun());
		
		return aveService.save(thisAve);
	}
	
	@DeleteMapping("/aves/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)//204
	public void delete(@PathVariable String id) {
		aveService.delete(id);
	}
	
	
}
