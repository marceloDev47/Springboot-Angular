package com.marcelodev.service;

import java.util.List;
import java.util.Optional;

import com.marcelodev.model.Paciente;

public interface ICRUD<T> {
	
	T registrar(T t);

	T modificar(T t);

	void eliminar(int id);

	Optional<Paciente> listarId(int id);

	List<T> listar();
	
}
