package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import com.gmail.jorge.jorgegmail.entity.Monigote;

public interface MonigoteService {
	public void save(Monigote m);
	public List<Monigote> findAll();
	public Monigote get(Long id);
	public void delete(Long id);
}
