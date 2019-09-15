package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import com.gmail.jorge.jorgegmail.entity.Persona;


public interface PersonaService {
	public List<Persona> findAll();
	public void save(Persona horas);
	public Persona update(Persona horas);
	public Persona findOne(Long id);
	public void delete(Persona hora);
	public Persona coundByHorasDia(Persona p);
	public Persona countByDiasTrabajados(Persona p);
}
