package com.gmail.jorge.jorgegmail.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.gmail.jorge.jorgegmail.entity.BillionairesMonigote;

@Repository
public class BillionairesMonigoteDAOImpl implements BillionairesMonigoteDAO {

	@PersistenceContext
	EntityManager em;

	// cambiar consulta
	@Override
	public List<BillionairesMonigote> findAll() {
		List<BillionairesMonigote> lista;
		String jpql = "select new com.gmail.jorge.jorgegmail.entity.BillionairesMonigote(billi.firstName, billi.lastName, mono.nombre, mono.apellido) from Billionaires as billi, Monigote as mono";

		TypedQuery<BillionairesMonigote> query = em.createQuery(jpql, BillionairesMonigote.class);
		lista = query.getResultList();
		System.out.println(lista.toString());
		return lista;
	}

	@Override
	public void save(BillionairesMonigote bm) {
		// TODO Auto-generated method stub

	}

}
