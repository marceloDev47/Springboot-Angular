package com.marcelodev.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelodev.dao.IExamenDAO;
import com.marcelodev.model.Examen;
import com.marcelodev.service.IExamenService;

@Service
public class ExamenServiceImpl implements IExamenService {

	@Autowired
	private IExamenDAO dao;

	@Override
	public Examen registrar(Examen p) {
		return dao.save(p);
	}

	@Override
	public Examen modificar(Examen p) {
		return dao.save(p);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Examen> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Examen> listar() {
		return dao.findAll();
	}

}
