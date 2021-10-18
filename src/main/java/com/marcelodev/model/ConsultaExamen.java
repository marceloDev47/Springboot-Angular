package com.marcelodev.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ConsultaExamenPK.class)
public class ConsultaExamen {
	
	@Id
	private Examen examen;
	
	@Id
	private Consulta consulta;

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	
	/*
	 {
	     "consulta" : {
				   "paciente": {
				       "idPaciente":1
				   },
				   "medico": {
				       "idMedico": 1
				   },
				   "especialidad": {
				       "idEspecialidad": 1
				   },
				   "fecha": "2021-01-01T15:00:00.000Z",
				   "detalleConsulta":[
				       {"diagnostico": "resfrío", "tratamiento": "té con limón" },
				       {"diagnostico": "gripe", "tratamiento": "paracetamol" }
				   ]     
	     	},
		   "examenes": [
			   {"idExamen":1},
			   {"idExamen":2}
		   ]
	}
	*/
	
}
