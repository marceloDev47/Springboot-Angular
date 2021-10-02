package com.marcelodev.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ConsultaExamenPK {
	
	@ManyToOne
	@JoinColumn(name = "id_examen")
	private Examen examen;
	
	@ManyToOne
	@JoinColumn(name = "id_consulta")
	private Consulta consulta;
	
}
