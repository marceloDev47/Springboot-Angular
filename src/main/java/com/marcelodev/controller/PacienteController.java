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

import com.marcelodev.model.Paciente;
import com.marcelodev.service.IPacienteService;
import com.marcelodev.service.impl.PacienteServiceImpl;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService service;
	
	@GetMapping(produces = "application/json")
	public List<Paciente> listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Optional<Paciente> listarId(@PathVariable Integer id){
		return service.listarId(id);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Paciente registrar(@RequestBody Paciente paciente) {
		return service.registrar(paciente);
	}
	
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Paciente modificar(@RequestBody Paciente paciente) {
		return service.modificar(paciente);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
