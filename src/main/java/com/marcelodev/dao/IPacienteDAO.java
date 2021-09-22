package com.marcelodev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelodev.model.Paciente;

public interface IPacienteDAO extends JpaRepository<Paciente, Integer>{

}
