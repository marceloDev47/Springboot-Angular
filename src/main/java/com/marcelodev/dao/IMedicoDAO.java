package com.marcelodev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelodev.model.Medico;

public interface IMedicoDAO extends JpaRepository<Medico, Integer>{

}
