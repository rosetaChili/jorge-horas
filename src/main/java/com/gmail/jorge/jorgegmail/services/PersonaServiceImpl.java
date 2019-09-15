package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.jorge.jorgegmail.DAO.PersonaDAO;
import com.gmail.jorge.jorgegmail.entity.Persona;

@Service
@Transactional
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	PersonaDAO personaDAO;

	@Override
	public List<Persona> findAll() {
		return personaDAO.findAll();
	}

	@Override
	public void save(Persona persona) {
		personaDAO.save(persona);
	}

	@Override
	public Persona update(Persona persona) {
		return personaDAO.save(persona);
	}

	@Override
	public Persona findOne(Long id) {
		return personaDAO.getOne(id);
	}

	@Override
	public void delete(Persona persona) {
		personaDAO.delete(persona);
	}

	@Override
	public Persona coundByHorasDia(Persona p) {
		return personaDAO.countByHorasDia(p);
	}

	@Override
	public Persona countByDiasTrabajados(Persona p) {
		return personaDAO.countByDiasTrabajados(p);
	}

}
