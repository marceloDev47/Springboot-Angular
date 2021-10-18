package com.marcelodev.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.marcelodev.dao.IConsultaDAO;
import com.marcelodev.dao.IConsultaExamenDAO;
import com.marcelodev.dto.ConsultaListaExamenDTO;
import com.marcelodev.model.Consulta;
import com.marcelodev.service.IConsultaService;

@Service
public class ConsultaServiceImpl implements IConsultaService{

	@Autowired
	private IConsultaDAO dao;
	
	@Autowired
	private IConsultaExamenDAO cedao;
	
	// @Override
	@Transactional
	public Consulta registrarTransaccional(ConsultaListaExamenDTO consultaDTO) {
		consultaDTO.getConsulta().getDetalleConsulta().forEach(detalle -> {
			detalle.setConsulta(consultaDTO.getConsulta());
		});
		
		// primero guardo la consulta con su detalle, esas 2 tablas
		dao.save(consultaDTO.getConsulta());
		
		// luego guardo la lista de examenes en la tabla consultaExamenes
		consultaDTO.getExamenes().forEach(
				e -> cedao.registrar(consultaDTO.getConsulta().getIdConsulta(),e.getIdExamen()));
		
		return consultaDTO.getConsulta();
	}

	@Override
	public Consulta modificar(Consulta p) {
		return dao.save(p);
	}
 
	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Consulta> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Consulta> listar() {
		return dao.findAll();
	}

	@Override
	public Consulta registrar(Consulta c) {
		return dao.save(c);
	}

}
