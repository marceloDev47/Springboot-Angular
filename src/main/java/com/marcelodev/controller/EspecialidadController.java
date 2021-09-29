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

import com.marcelodev.model.Especialidad;
import com.marcelodev.service.IEspecialidadService;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {
	
	@Autowired
	private IEspecialidadService service;
	
	@GetMapping(produces = "application/json")
	public List<Especialidad> listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Optional<Especialidad> listarId(@PathVariable Integer id){
		return service.listarId(id);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Especialidad registrar(@RequestBody Especialidad Especialidad) {
		return service.registrar(Especialidad);
	}
	
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Especialidad modificar(@RequestBody Especialidad Especialidad) {
		return service.modificar(Especialidad);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
