package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import com.gmail.jorge.jorgegmail.entity.Horas;

public interface HorasService {
	
	public List<Horas> findAll();
	public void save(Horas horas);
	public Horas update(Horas horas);
	public Horas findOne(Long id);
	public void delete(Horas hora);
	public Horas findDiasTrabajados(Long id);
	
}
