package com.marcelodev.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelodev.model.Examen;
import com.marcelodev.service.IExamenService;

@RestController
@RequestMapping("/examenes")
public class ExamenController {
	
	@Autowired
	private IExamenService service;
	
	@GetMapping(produces = "application/json")
	public List<Examen> listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Optional<Examen> listarId(@PathVariable Integer id){
		return service.listarId(id);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Examen registrar(@RequestBody Examen examen) {
		return service.registrar(examen);
	}
	
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Examen modificar(@RequestBody Examen examen) {
		return service.modificar(examen);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
