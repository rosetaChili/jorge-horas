package com.gmail.jorge.jorgegmail.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gmail.jorge.jorgegmail.entity.Monigote;

@Repository
public interface MonigoteDAO extends JpaRepository<Monigote, Long>,JpaSpecificationExecutor<Monigote>{

	@Query(value="SELECT mono FROM Monigote as mono WHERE mono.id = :id")
	public Monigote buscaPorId(Long id);
	
	
}
