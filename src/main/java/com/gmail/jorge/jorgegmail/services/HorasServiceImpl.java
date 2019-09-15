package com.gmail.jorge.jorgegmail.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gmail.jorge.jorgegmail.DAO.HorasDAO;
import com.gmail.jorge.jorgegmail.entity.Horas;


@Service
@Transactional
public class HorasServiceImpl implements HorasService{

	@Autowired
	HorasDAO horasDAO;
	
	@Override
	public List<Horas> findAll() {
		return horasDAO.findAll();
	}

	@Override
	public void save(Horas horas) {
		horasDAO.save(horas);
		
	}

	@Override
	public Horas update(Horas horas) {
		return horasDAO.save(horas);
	}

	@Override
	public Horas findOne(Long id) {
		return horasDAO.getOne(id);
	}

	@Override
	public void delete(Horas hora) {
		horasDAO.delete(hora);
		
	}

	@Override
	public Horas findDiasTrabajados(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
