package com.gmail.jorge.jorgegmail.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.gmail.jorge.jorgegmail.entity.Persona;

@Repository
public interface PersonaDAO extends JpaRepository<Persona, Long>,JpaSpecificationExecutor<Persona>{

	
	Persona countByDiasTrabajados(Persona p);
	Persona countByHorasDia(Persona p);
}
