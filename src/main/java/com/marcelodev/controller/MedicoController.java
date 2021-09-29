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

import com.marcelodev.model.Medico;
import com.marcelodev.service.IMedicoService;
import com.marcelodev.service.impl.MedicoServiceImpl;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@Autowired
	private IMedicoService service;
	
	@GetMapping(produces = "application/json")
	public List<Medico> listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Optional<Medico> listarId(@PathVariable Integer id){
		return service.listarId(id);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Medico registrar(@RequestBody Medico Medico) {
		return service.registrar(Medico);
	}
	
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Medico modificar(@RequestBody Medico Medico) {
		return service.modificar(Medico);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
