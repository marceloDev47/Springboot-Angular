package com.marcelodev.mediappbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelodev.mediappbackend.model.Paciente;

public interface IPacienteDAO extends JpaRepository<Paciente, Integer>{

}
