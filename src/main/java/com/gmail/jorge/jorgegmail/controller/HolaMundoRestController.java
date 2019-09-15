package com.gmail.jorge.jorgegmail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.jorge.jorgegmail.entity.Billionaires;
import com.gmail.jorge.jorgegmail.services.BillionairesService;

@RestController
@RequestMapping(value = "/api/v1/")
public class HolaMundoRestController {

	@Autowired
	private BillionairesService billionaireService;

	@GetMapping(value = "/all")
	public List<Billionaires> getAll() {
		return billionaireService.findAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public Billionaires find(@PathVariable Long id) {
		return billionaireService.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Billionaires> save(@RequestBody Billionaires persona) {
		Billionaires obj = billionaireService.save(persona);
		return new ResponseEntity<Billionaires>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Billionaires> delete(@PathVariable Long id) {
		Billionaires persona = billionaireService.get(id);
		if (persona != null) {
			billionaireService.delete(id);
		}else {
			return new ResponseEntity<Billionaires>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Billionaires>(persona, HttpStatus.OK);
	}
}
