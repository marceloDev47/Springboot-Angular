package com.marcelodev.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelodev.dao.IEspecialidadDAO;
import com.marcelodev.model.Especialidad;
import com.marcelodev.service.IEspecialidadService;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	@Autowired
	private IEspecialidadDAO dao;
	
	@Override
	public Especialidad registrar(Especialidad p) {
		return dao.save(p);
	}

	@Override
	public Especialidad modificar(Especialidad p) {
		return dao.save(p);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Especialidad> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Especialidad> listar() {
		List<Especialidad> Especialidads;
		Especialidads = dao.findAll();
		return Especialidads;
	}

}
