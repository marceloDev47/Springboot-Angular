package com.marcelodev.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelodev.dao.IMedicoDAO;
import com.marcelodev.model.Medico;
import com.marcelodev.service.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService{

	@Autowired
	private IMedicoDAO dao;
	
	@Override
	public Medico registrar(Medico p) {
		return dao.save(p);
	}

	@Override
	public Medico modificar(Medico p) {
		return dao.save(p);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Medico> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Medico> listar() {
		List<Medico> Medicos;
		Medicos = dao.findAll();
		return Medicos;
	}

}
