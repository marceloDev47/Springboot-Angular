package com.marcelodev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelodev.model.Examen;

public interface IExamenDAO extends JpaRepository<Examen, Integer>{

}
