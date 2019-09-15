package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.jorge.jorgegmail.DAO.MonigoteDAO;
import com.gmail.jorge.jorgegmail.entity.Monigote;

@Service
@Transactional
public class MonigoteServiceImpl implements MonigoteService{
	
	@Autowired
	MonigoteDAO monigoteDAO;
	
	public void save(Monigote m) {
		monigoteDAO.save(m);
	}

	@Override
	public List<Monigote> findAll() {
		// TODO Auto-generated method stub
		return monigoteDAO.findAll();
	}

	@Override
	public Monigote get(Long id) {
		// TODO Auto-generated method stub
		return monigoteDAO.buscaPorId(id);
	}

	@Override
	public void delete(Long id) {
		monigoteDAO.deleteById(id);;
		
	}
}
