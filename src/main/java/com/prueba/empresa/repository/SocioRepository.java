package com.prueba.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.empresa.entities.Socio;


public interface SocioRepository extends CrudRepository<Socio, Long>{

	@Query(value = "SELECT * FROM socios "
			+ "WHERE montoMaximo >= :valor ORDER BY tasa ASC", nativeQuery = true)
	public List<Socio> findSocioDisponibles(@Param("valor")float valor);

}
