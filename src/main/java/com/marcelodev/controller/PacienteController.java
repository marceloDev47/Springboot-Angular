package com.marcelodev.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.marcelodev.exception.ModeloNotFoundException;
import com.marcelodev.model.Paciente;
import com.marcelodev.service.IPacienteService;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "Informacion del paciente")
@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService service;
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Paciente>> listar(){
		List<Paciente> pacientes = service.listar();
		return new ResponseEntity<List<Paciente>>(pacientes, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<Optional<Paciente>> listarId(@PathVariable Integer id){
		return new ResponseEntity<Optional<Paciente>>(service.listarId(id),HttpStatus.OK);
	}
	
//	@PostMapping(consumes = "application/json", produces = "application/json")
//	public ResponseEntity<Paciente> registrar(@RequestBody Paciente paciente) {
//		return new ResponseEntity<Paciente>(service.registrar(paciente),HttpStatus.CREATED);
//	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<Paciente> registrar(@RequestBody Paciente paciente) {
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(paciente.getIdPaciente()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	
	@PutMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<Paciente> modificar(@RequestBody Paciente paciente) {
		return new ResponseEntity<Paciente>(service.modificar(paciente), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable Integer id) {
		Optional<Paciente> paciente = service.listarId(id);
		if(paciente == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: "+id);
		}
		service.eliminar(id);
	}
}
