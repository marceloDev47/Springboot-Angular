package com.marcelodev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelodev.model.Consulta;

public interface IConsultaDAO extends JpaRepository<Consulta, Integer>{

}
