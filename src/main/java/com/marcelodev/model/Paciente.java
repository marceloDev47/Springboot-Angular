package com.marcelodev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pacientes")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaciente;
	
	@Size(min = 3, message = "Nombres de tener al menos 3 caracteres")
	@Column(name = "nombres", nullable = false, length = 50)
	private String nombres;

	@Size(min = 3, message = "Apellidos debe tener al menos 3 caracteres")
	@Column(name = "apellidos", nullable = false, length = 50)
	private String apellidos;

	@Size(min = 8, message = "DNI debe tener al menos 8 caracteres")
	@Column(name = "dni", nullable = false, length = 8)
	private String dni;

	@Column(name = "direccion", nullable = true, length = 150)
	private String direccion;

	@Column(name = "telefono", nullable = true, length = 10)
	private String telefono;

	@Column(name = "email", nullable = true, length = 100)
	private String email;

	public Paciente() {

	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	 * 	{
	        "nombres": "jose luis",
	        "apellidos": "sanchez",
	        "dni": "12123999",
	        "direccion": "san martin 5555",
	        "telefono": "12345",
	        "email": "jose@gmail.com"
    	}
	 */

}
