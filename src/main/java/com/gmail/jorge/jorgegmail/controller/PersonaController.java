package com.gmail.jorge.jorgegmail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.gmail.jorge.jorgegmail.entity.Horas;
import com.gmail.jorge.jorgegmail.entity.Persona;
import com.gmail.jorge.jorgegmail.services.HorasService;
import com.gmail.jorge.jorgegmail.services.PersonaService;
import com.gmail.jorge.jorgegmail.util.DevolverHorasRestantes;
import com.gmail.jorge.jorgegmail.util.HorasTotalesACalcular;

@Controller
@Configurable
@RequestMapping("/persona")
public class PersonaController implements WebMvcConfigurer {

	@Autowired
	PersonaService personaService;
	
	@Autowired
	HorasService horasService;
	
	private HorasTotalesACalcular horasTotalesACalcular;

	@RequestMapping(method = RequestMethod.GET, value = "/save/persona/0")
	public String home(Model model) {
		Persona persona = new Persona();
		model.addAttribute("persona", persona);
		return "personaForm.html";
	}
	
	@PostMapping("/save/persona")
	public String savePersona(Persona personaAGuardar, Model model, BindingResult bindingResult, Errors hasErrors) {
		personaAGuardar.setMediaHoras("0");
		List<Horas> list = horasService.findAll();
		model.addAttribute("list", list);
		List<Persona> persona =  personaService.findAll();
		model.addAttribute("personal", persona);
		
		DevolverHorasRestantes devoler = new DevolverHorasRestantes();
		double res = devoler.devolverHoras(personaAGuardar, null);
		personaAGuardar.setHorasTotalesRestantes(String.valueOf(res));
		
		personaService.save(personaAGuardar);
		model.addAttribute("horasRestantesTotal", res);
		return "redirect:/horas";
	}

	public HorasTotalesACalcular getHorasTotalesACalcular() {
		return horasTotalesACalcular;
	}

	public void setHorasTotalesACalcular(HorasTotalesACalcular horasTotalesACalcular) {
		this.horasTotalesACalcular = horasTotalesACalcular;
	}
	
}
