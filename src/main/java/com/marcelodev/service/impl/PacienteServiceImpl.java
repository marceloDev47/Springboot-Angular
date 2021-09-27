package com.marcelodev.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelodev.dao.IPacienteDAO;
import com.marcelodev.model.Paciente;
import com.marcelodev.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteDAO dao;
	
	@Override
	public Paciente registrar(Paciente p) {
		return dao.save(p);
	}

	@Override
	public Paciente modificar(Paciente p) {
		return dao.save(p);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Paciente> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Paciente> listar() {
		List<Paciente> pacientes;
		pacientes = dao.findAll();
		return pacientes;
	}

}
