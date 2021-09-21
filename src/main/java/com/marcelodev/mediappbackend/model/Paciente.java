package com.marcelodev.mediappbackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {
	private Integer idPaciente;
	private String nombre;
	private String matricula;
	
	public Paciente() {
		
	}
	
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
