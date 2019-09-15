package com.gmail.jorge.jorgegmail.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gmail.jorge.jorgegmail.entity.Horas;


@Repository
public interface HorasDAO extends JpaRepository<Horas, Long>, JpaSpecificationExecutor<Horas> {

//	@Query(value="SELECT hora FROM Horas as hora WHERE hora.id :id")
//	public Horas findOneByMe(Long id);
	
}
