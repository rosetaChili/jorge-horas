package com.gmail.jorge.jorgegmail.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.jorge.jorgegmail.DAO.BillionairesMonigoteDAO;
import com.gmail.jorge.jorgegmail.entity.BillionairesMonigote;

@Service
public class BillionairesMonigoteServiceImpl implements BillionairesMonigoteService {

	@Autowired
	BillionairesMonigoteDAO billionairesMonigoteDAO;

	@Override
	public List<BillionairesMonigote> findAll() {
		// TODO Auto-generated method stub
		return billionairesMonigoteDAO.findAll();
	}

	@Override
	public void save(BillionairesMonigote b) {
		billionairesMonigoteDAO.save(b);

	}

}
