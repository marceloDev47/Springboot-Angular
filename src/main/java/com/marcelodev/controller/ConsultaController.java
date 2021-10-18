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

import com.marcelodev.dto.ConsultaListaExamenDTO;
import com.marcelodev.model.Consulta;
import com.marcelodev.service.IConsultaService;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
	
	@Autowired
	private IConsultaService service;
	
	@GetMapping(produces = "application/json")
	public List<Consulta> listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Optional<Consulta> listarId(@PathVariable Integer id){
		return service.listarId(id);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Consulta registrar(@RequestBody ConsultaListaExamenDTO consultaDTO) {
		return service.registrarTransaccional(consultaDTO);
	}
	
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Consulta modificar(@RequestBody Consulta consulta) {
		return service.modificar(consulta);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
