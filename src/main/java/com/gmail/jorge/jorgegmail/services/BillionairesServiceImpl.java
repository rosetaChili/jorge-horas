package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.jorge.jorgegmail.DAO.BillionairesDAO;
import com.gmail.jorge.jorgegmail.entity.Billionaires;

@Service
@Transactional
public class BillionairesServiceImpl implements BillionairesService{

	@Autowired
	BillionairesDAO billionairesDAO;
	
	@Override
	public Billionaires save(Billionaires b) {

		return billionairesDAO.save(b);
	}

	@Override
	public List<Billionaires> findAll() {
		return billionairesDAO.findAll();
		
	}

	@Override
	public Billionaires get(Long id) {
		return billionairesDAO.buscaById(id);
	}

	@Override
	public void delete(Long b) {
		billionairesDAO.deleteById(b);
		
		
	}
	
	
	

}
