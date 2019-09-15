package com.gmail.jorge.jorgegmail.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gmail.jorge.jorgegmail.entity.Billionaires;


@Repository
public interface BillionairesDAO extends JpaRepository<Billionaires, Long>,JpaSpecificationExecutor<Billionaires>{
	
	@Query(value="SELECT billionaires FROM Billionaires as billionaires WHERE id = :id")
	public Billionaires buscaById(Long id);
	
}

