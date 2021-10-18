package com.marcelodev.service;

import com.marcelodev.dto.ConsultaListaExamenDTO;
import com.marcelodev.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta>{
	
	Consulta registrarTransaccional(ConsultaListaExamenDTO consultaDTO);
	
}
