package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import com.gmail.jorge.jorgegmail.entity.BillionairesMonigote;

public interface BillionairesMonigoteService {
	
	public List<BillionairesMonigote> findAll();
	public void save(BillionairesMonigote b);

}
