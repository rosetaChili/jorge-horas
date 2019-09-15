package com.gmail.jorge.jorgegmail.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/horas")
public class HorasController implements WebMvcConfigurer {

	@Autowired
	HorasService horasService;

	@Autowired
	PersonaService personaService;

	private HorasTotalesACalcular horasTotalesACalcular;

	Calendar ca = Calendar.getInstance();
	String[] partes = null;

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {

		List<Horas> list = horasService.findAll();
		model.addAttribute("list", list);
		List<Persona> persona = personaService.findAll();
		model.addAttribute("personal", persona);

		String horasTotales = "";
		for (Persona p : persona) {
			horasTotales = p.getHorasTotalesRestantes().toString();
		}
		model.addAttribute("horasRestantesTotal", horasTotales);
		return "horasTotales.html";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/save/horas/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if (id != null && id != 0) {
			// actualizar
			model.addAttribute(horasService.findOne(id));
		} else {
			Horas b = new Horas();
			model.addAttribute("horas", b);
		}
		String parte1 = parte1();
		String horasInp = null;
		model.addAttribute("dia", parte1);
		model.addAttribute("diaCompleto", "Horas a inputar");
		model.addAttribute("horasInputadas", horasInp);
		return "horas.html";
	}

	@PostMapping("/save/horas")
	public String saveHoras(Horas horas, Model model, BindingResult bindingResult, Errors hasErrors) {
		horas.setDia(partes[0]);
		horas.setMes(partes[1]);
		horas.setNumeroDia(partes[2]);
		horas.setHoraDelRegistroDeHoras(partes[3]);
		horas.setAnyo(partes[5]);
		// reevisar horas
		List<Persona> persona = personaService.findAll();
		
		//horas.setHorasDia("8");
		horas.setHorasSemana(persona.get(0).getHorasSemana());
		horas.setHorasTotales(persona.get(0).getHorasTotales());

		Persona per = persona.get(0);

		int value = Integer.parseInt(per.getDiasTrabajados()) + 1;
		per.setDiasTrabajados(String.valueOf(value));

		DevolverHorasRestantes devoler = new DevolverHorasRestantes();

		double mediaHora = devoler.calcularMediaHoras(horas.getHorasDia());
		
		per.getHoras().add(horas);
		per.setMediaHoras(String.valueOf(mediaHora));

		personaService.save(per);

		persona = personaService.findAll();
		double res = devoler.devolverHoras(persona.get(0), persona.get(0).getHoras());

		per.setHorasTotalesRestantes(String.valueOf(res));
		per.setHorasDia(horas.getHorasDia());

		personaService.save(per);
		List<Horas> list = horasService.findAll();
		list = horasService.findAll();
		persona = personaService.findAll();

		model.addAttribute("list", list);
		model.addAttribute("personal", persona);
		model.addAttribute("horasRestantesTotal", res);
		return "redirect:/horas";
	}

	private String parte1() {
		String time = ca.getTime().toString();
		partes = time.split(" ");
		String dia = "";
		switch (partes[0]) {
		case "Sun":
			dia = "DOMINGO";
			break;
		case "Mon":
			dia = "LUNES";
			break;
		case "Tue":
			dia = "MARTES";
			break;
		case "Wed":
			dia = "MIERCOLES";
			break;
		case "Thu":
			dia = "JUEVES";
			break;
		case "Fri":
			dia = "VIERNES";
			break;
		case "Sat":
			dia = "SABADO";
			break;
		}
		return dia + " " + partes[2];
	}

	public HorasTotalesACalcular getHorasTotalesACalcular() {
		return horasTotalesACalcular;
	}

	public void setHorasTotalesACalcular(HorasTotalesACalcular horasTotalesACalcular) {
		this.horasTotalesACalcular = horasTotalesACalcular;
	}

}
