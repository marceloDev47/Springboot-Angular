package com.marcelodev.mediappbackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {
	private Integer idPaciente;
	private String nombre;
	
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
	
	
}
