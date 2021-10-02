package com.marcelodev.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ConsultaExamenPK {
	
	// implementar Serializable
	
	@ManyToOne
	@JoinColumn(name = "id_examen") // idExamen
	private Examen examen;
	
	@ManyToOne
	@JoinColumn(name = "id_consulta") // idConsulta
	private Consulta consulta;
	
	/*
	 * TODO - sobreescribir metodos equal and hashcode
	 */
	
}
