package com.marcelodev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMedico;
	
	@Column(name = "nombres", nullable = false, length = 50)
	private String nombres;

	@Column(name = "apellidos", nullable = false, length = 50)
	private String apellidos;

	@Column(name = "cpm", nullable = false, length = 8)
	private String cmp;

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	
	
	/*
	   {
	    "nombres": "Goerge",
	    "apellidos": "Phillip",
	    "cmp": "12994599"
		}
	 */
}
