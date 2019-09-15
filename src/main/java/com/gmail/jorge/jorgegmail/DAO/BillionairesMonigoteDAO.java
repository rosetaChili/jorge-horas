package com.gmail.jorge.jorgegmail.DAO;

import java.util.List;

import com.gmail.jorge.jorgegmail.entity.BillionairesMonigote;

public interface BillionairesMonigoteDAO{
	
	List<BillionairesMonigote> findAll();
	void save(BillionairesMonigote bm);
	

}
