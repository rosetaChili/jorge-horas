package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import com.gmail.jorge.jorgegmail.entity.Billionaires;

public interface BillionairesService {
	
	public List<Billionaires> findAll();
	
	public Billionaires get(Long id);
	
	public void delete(Long b);

	Billionaires save(Billionaires b);

}
