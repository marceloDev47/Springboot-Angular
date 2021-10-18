package com.marcelodev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.marcelodev.model.ConsultaExamen;

public interface IConsultaExamenDAO extends JpaRepository<ConsultaExamen, Integer>{

	@Modifying
	@Query(nativeQuery = true,value = "INSERT INTO consulta_examen(id_consulta,id_examen) VALUES (:idConsulta, :idExamen)")
	Integer registrar(@Param("idConsulta") Integer idConsulta, @Param("idExamen") Integer idExamen);
}
